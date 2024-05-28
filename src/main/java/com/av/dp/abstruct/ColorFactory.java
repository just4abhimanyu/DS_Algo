package com.av.dp.abstruct;

public class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null; // Color factory doesn't deal with shapes
    }

    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        } else if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
