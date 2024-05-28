package com.av.dp.abstruct;

public class AbstractDPTest {
    public static void main(String[] args) {
        // Get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // Get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        // Call draw method of Shape Circle
        shape1.draw();

        // Get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // Get an object of Color Red
        Color color1 = colorFactory.getColor("RED");
        // Call fill method of Red
        color1.fill();
    }
}
