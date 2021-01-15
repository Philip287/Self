package Glava10.Task6.Class;

import Glava10.Task6.Interfase.Action;

public class Box1 {
    protected class BoxChocolate implements Action {
        String nameBox;

        public BoxChocolate(String nameBox) {
            this.nameBox = nameBox;
        }

        @Override
        public String toString() {
            return "BoxChocolate nameBox = " + nameBox;
        }

        public String toDo(){
            return "Open ad It's bitten";
        }
        public BoxChocolate returneteder(){
            return BoxChocolate.this;
        }
    }
}
