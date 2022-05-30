package com.company;

public class Triangle implements ShapePart {
    @Override
    public void accept (ShapePartVisitor shapePartVisitor){
        shapePartVisitor.visit(this);
    }
}
