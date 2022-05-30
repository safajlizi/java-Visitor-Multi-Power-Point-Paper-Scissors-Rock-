package com.company;

public class ShapePartDisplayVisitor implements ShapePartVisitor{
    @Override
    public void visit(Shape shape) {
        System.out.println("Displaying shape");
    }
    @Override
    public void visit(Circle circle) {
        System.out.println("Displaying circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Displaying rectangle");
    }

    @Override
    public void visit(Triangle triangle ) {
        System.out.println("Displaying Triangle");
    }
}
