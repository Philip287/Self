package Glava10.Task14;

public class RearrangeStatic implements Processor {
    @Override
    public String name() {
        String staticString = "12345678";
        return staticString;
    }

    @Override
    public Object process(Object input) {
        String str = (String) input;
        char[] array = str.toCharArray();
        String result = "";
        for (int i = 0; i < array.length; i+=2) {
            result = result + array[i + 1];
            result = result + array[i];
        }

//        for (int i = 0; i < array.length; i+=2) {
//            char temp =array[i];
//            array[i] = array[i+1];
//            array[i+1] = temp;
//        }
//        result = new String(array);
        System.out.println(result);
        return result;
    }

    public static RearrangeFactory factory =
            new RearrangeFactory() {
                @Override
                public Processor getProcessor() {
                    return new RearrangeStatic();
                }
            };
}
