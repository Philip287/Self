package JavaVideo.List.Generics;

public class Container {

    private  Object object1;

    public Container(Object object1) {
        this.object1 = object1;
    }

    public Object getObject1() {
        return object1;
    }

    public void setObject1(Object object1) {
        this.object1 = object1;
    }

    @Override
    public String toString() {
        return "Container: object1= " + object1;
    }
}
