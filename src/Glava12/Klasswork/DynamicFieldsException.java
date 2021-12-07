package Glava12.Klasswork;

import java.util.NoSuchElementException;

public class DynamicFieldsException extends Exception {

}

class DynamicFields {
    private Object[][] fields;

    public DynamicFields(int initialSize) {
        fields = new Object[initialSize][12];
        for (int i = 0; i < initialSize; i++)
            fields[i] = new Object[]{null, null};
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields) {
            result.append(obj[0]);
            result.append(" : ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }

    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++)
            if (id.equals(fields[i][0]))
                return i;
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException {
        int fieldNum = hasField(id);
        if (fieldNum == -1)
            throw new NoSuchFieldException();
        return fieldNum;
    }

    private int makeFeild(String id) {
        for (int i = 0; i < fields.length; i++)
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }


        //Пустых полей нет, добавить новое:
        Object[][] tmp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++)
            tmp[i] = fields[i];
        for (int i = fields.length; i < tmp.length; i++)
            tmp[i] = new Object[] {null, null};
        fields = tmp;
        //рекурсивный вызов с новыми полями:
        return makeFeild(id);
    }

    public Object getFeild(String id) throws NoSuchFieldException{
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws DynamicFieldsException{
        if(value == null){
            //У большинства исключений нет конструктора, принимающего объект-причину.
            // В таких случаях следует использовать метод initCause(), доступный всем подклассам Throwable.
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }
        int fieldNUmber = hasField(id);
        if(fieldNUmber == -1)
            fieldNUmber = makeFeild(id);
        Object result = null;
        try{
            result = getFeild(id); // Получаем старое значение
        } catch (NoSuchFieldException e){
            // Используем конструктор с причиной;
            throw new RuntimeException();
        }
        fields[fieldNUmber][1] = value;
        return result;
    }

    public static void main(String[] args) {

    }
}
