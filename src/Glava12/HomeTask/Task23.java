package Glava12.HomeTask;

import java.io.*;

public class Task23 {
    public Task23() throws Exception {
        InputFile iner = null;
        try {
            iner = new InputFile("Task23.java");
            throw new Exception();
        } catch (Exception e) {
            try {
                iner = new InputFile("Task23.java");
            } finally {
                iner.dispose();
            }
        }
    }

    public void dispose() {
        try {
            System.out.println("dispose() successful");
        } finally {
            System.out.println("The end");
        }
    }

    public static void main(String[] args) {
        Task23 ns = null;
        try {
            ns = new Task23();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("Done");
        } finally {
            ns.dispose();
        }
    }
}


class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
            // Other code that might throw exceptions
        } catch(FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            // Wasn't open, so don't close it
            throw e;
        } catch(Exception e) {
            // All other exceptions must close it
            try {
                in.close();
            } catch(IOException e2) {
                System.out.println("in.close() unsuccessful");
            }
            throw e; // Rethrow
        } finally {
            // Don't close it here!!!
        }
    }
    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch(IOException e) {
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }
    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() successful");
        } catch(IOException e2) {
            throw new RuntimeException("in.close() failed");
        }
    }
}
