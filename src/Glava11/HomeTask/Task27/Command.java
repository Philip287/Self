package Glava11.HomeTask.Task27;

public class Command {
    public String str;

    public void operation(Command c){
        System.out.println(c.str);
    }

    public Command(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Command{" +
                "str='" + str + '\'' +
                '}';
    }
}
