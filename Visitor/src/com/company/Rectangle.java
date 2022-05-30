package com.company;

public class Rectangle implements ShapePart {

    @Override
    public void accept (ShapePartVisitor shapePartVisitor){
        shapePartVisitor.visit(this);
    }
}
