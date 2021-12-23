package Glava12.HomeTask;

public class Task4Exception extends RuntimeException {
    String s;

    /**
     * Constructs an <code>IndexOutOfBoundsException</code> with no
     * detail message.
     */
    public Task4Exception(String s) {
        this.s = s;
    }

    /**
     * Constructs an <code>IndexOutOfBoundsException</code> with the
     * specified detail message.
     *
     * @param s the detail message.
     */
    public Task4Exception(String s, String s1) {
        super(s);
        this.s = s1;
    }

    @Override
    public String toString() {
        return "Task4Exception{" +
                "s='" + s + '\'' +
                '}';
    }
}

class Runner {
    public static void main(String[] args) {
            throw new Task4Exception("Error 1");
    }
}
