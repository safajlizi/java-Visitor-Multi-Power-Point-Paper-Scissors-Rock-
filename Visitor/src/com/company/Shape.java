package com.company;

public class Shape implements ShapePart{

      ShapePart[] parts;

    public Shape(){
        parts = new ShapePart[] {new Circle(), new Rectangle(), new Triangle()};
    }


    @Override
    public void accept(ShapePartVisitor shapePartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(shapePartVisitor);
        }
        shapePartVisitor.visit(this);
    }

}
