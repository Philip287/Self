package Glava11.HomeTask.Task15;
import  Glava11.Klasswork.Stack;

public class StackHome {
    public static void main(String[] args) {
        Glava11.Klasswork.Stack<String> stack = new Glava11.Klasswork.Stack<>();
        stack.push("u");
        stack.push("n");
        stack.push("c");
        System.out.print(stack.pop()+stack.pop() + stack.pop());
        stack.push("e");
        stack.push("r");
        stack.push("t");
        System.out.print(stack.pop()+stack.pop() + stack.pop());
        stack.push("a");
        System.out.print(stack.pop());
        stack.push("i");
        System.out.print(stack.pop());
        stack.push("n");
        stack.push("t");
        stack.push("y");
        System.out.print(stack.pop()+stack.pop() + stack.pop());
        stack.push(" ");
        System.out.print(stack.pop());
        stack.push("r");
        stack.push("u");
        System.out.print(stack.pop()+stack.pop());
        stack.push("l");
        stack.push("e");
        stack.push("s");
        System.out.print(stack.pop()+stack.pop() + stack.pop());
    }
}
