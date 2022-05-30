package com.company;

public class Main {

    public static void main(String[] args) {
        ShapePart shape = new Shape();
        shape.accept(new ShapePartDisplayVisitor());
    }
}
