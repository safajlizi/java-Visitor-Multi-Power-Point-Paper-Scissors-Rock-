package com.company;

public class Circle  implements ShapePart {
    @Override
    public void accept (ShapePartVisitor shapePartVisitor){
        shapePartVisitor.visit(this);
    }
}
