package com.company;

public interface ShapePartVisitor {

    public void visit(Shape shape);
    public void visit(Circle circle);
    public void visit(Rectangle rectangle);
    public void visit(Triangle triangle);


}
