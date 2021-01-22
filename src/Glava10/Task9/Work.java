package Glava10.Task9;

public class Work {
    private class FirstTeam implements Team {
        int i = 10;

        @Override
        public void meeting(int i) {
            System.out.println("meeting is start with  " + i + " co-workers");
        }
    }

    public FirstTeam returnited() {
        return new FirstTeam();
    }

    public static void main(String[] args) {
        Work work = new Work();
        Team S = work.returnited();
        System.out.println(S);
    }
}
