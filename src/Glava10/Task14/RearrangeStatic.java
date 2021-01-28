package Glava10.Task14;

public class RearrangeStatic implements Processor {
    @Override
    public String name() {
        String staticString = "ProcessorIngeneringSystems ";
        return staticString;
    }

    @Override
    public Object process(Object input) {
        String str = (String)input;
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
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
