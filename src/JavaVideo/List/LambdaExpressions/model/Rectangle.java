package JavaVideo.List.LambdaExpressions.model;

import JavaVideo.List.LambdaExpressions.model.Shape;

public class Rectangle implements Shape {

    public Rectangle(){
        System.out.println("Creating Rectangle");
    }

    @Override
    public double calcSquare() {
        return 3;
    }
}
