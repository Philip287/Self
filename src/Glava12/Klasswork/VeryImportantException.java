package Glava12.Klasswork;

public class VeryImportantException extends Exception {
    public String toString() {
        return "Very Important Exception";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "Second Hum Exception";
    }
}

class HaException extends Exception {
    public String toString() {
        return "3 Hum Exception";
    }
}

class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    static void g() throws HaException {
        throw new HaException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}