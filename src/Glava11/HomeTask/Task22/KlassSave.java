package Glava11.HomeTask.Task22;

public class KlassSave {
    private String str1;
    private int count;

    public KlassSave(String str1, int count) {
        this.str1 = str1;
        this.count = count;

    }

    @Override
    public String toString() {
        return str1 + "-count" + count;
    }
}
