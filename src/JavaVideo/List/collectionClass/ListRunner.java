package JavaVideo.List.collectionClass;

import java.util.Scanner;

public class ListRunner {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        printOut();
        int param = scanner.nextInt();
        while (param != 0) {
            switch (param) {
                case 1:
                    System.out.println("Please enter task to add");
                    scanner.nextLine();
                    String task1 = scanner.nextLine();
                    list.addToList(task1);
                    System.out.println("Please choose sn action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Print out ToDoList:\n");
                    list.printToDoList();
                    System.out.println("Please choose sn action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Please enter an item to update");
                    scanner.nextLine();
                    int i = scanner.nextInt();
                    System.out.println("Please enter a new task");
                    String task3 = scanner.nextLine();
                    list.changeTask(i, task3);
                    System.out.println("Please choose sn action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Please enter a task to remove");
                    scanner.nextLine();
                    String task4 = scanner.nextLine();
                    list.removeTask(task4);
                    System.out.println("Please choose sn action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Please enter a task to get priority");
                    scanner.nextLine();
                    String task5 = scanner.nextLine();
                    System.out.println("Priority of the task is: " + list.getTaskPriority(task5));
                    System.out.println("Please choose sn action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Please enter a number of position for the task");
                    scanner.nextLine();
                    int index = scanner.nextInt();
                    System.out.println("Please enter a new task");
                    scanner.nextLine();
                    String task6 = scanner.nextLine();
                    list.addToListAtPosition(index,task6);
                    System.out.println("Please choose sn action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                default:
                    param = 0;
            }
        }
    }

    public static void printOut() {
        System.out.print("Please choose an action. Press:\n" +
                "1 to add a new item into toDoList;\n" +
                "2 to print out the List;\n" +
                "3 to update an existing item;\n" +
                "4 to to remove an item to the List\n" +
                "5 to to get task priority or number in the list\n" +
                "6 to to add a new item at specific position\n" +
                "press 0 to EXIT\n \n" +
                "AFTER CHOOSING AN OPTION PLEASE PRESS ENTER: ");
    }

}
