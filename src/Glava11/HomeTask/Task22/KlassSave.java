package Glava11.HomeTask.Task22;

import java.util.Objects;

public class KlassSave {
    private String str1;
    private int count;

    public KlassSave(String str1, int count) {
        this.str1 = str1;
        this.count = count;

    }

    @Override
    public String toString() {
        return str1 + "-" + count;
    }

    public String getStr1() {
        return str1;
    }

    public int getCount() {
        return count;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KlassSave klassSave = (KlassSave) o;
        return Objects.equals(str1, klassSave.str1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str1);
    }
}


