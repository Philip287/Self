package JavaVideo.List;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List <String> toDoList = new ArrayList<>();
    public void addToList (String Task){
        toDoList.add(Task);
    }
    public void addToListAtPosition(int position, String task){
        toDoList.add(position,task);

    }
    public void printToDoList(){
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " - " + toDoList.get(i));

        }
    }
    public void changTask(int index, String task){
        toDoList.set(index,task);
    }
}
