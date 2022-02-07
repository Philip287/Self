package GlavaFunctionalProgramming;

class Dog{
    String name;
    int age = -1; // for "Unknown"
    Dog(){
        name = "stray";
    }

    Dog(String name){
        this.name = name;
    }

    Dog(String name, int ears){
        this.name = name;
        this.age = ears;
    }
}

interface MakeNoArgs{
    Dog make();
}

interface Make1Args{
    Dog make(String name);
}

interface Make2Args{
    Dog make(String name, int age);
}

public class CtorReference {
    public static void main(String[] args) {
        MakeNoArgs mna = Dog::new;   //1
        Make1Args m1a = Dog::new;   //2
        Make2Args m2a = Dog::new;   //3

        Dog dn = mna.make();
        Dog d1 = m1a.make("Comet");
        Dog d2 = m2a.make("Ralh", 14);
    }
}
