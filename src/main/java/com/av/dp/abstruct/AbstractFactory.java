package com.av.dp.abstruct;

public interface AbstractFactory {
    Shape getShape(String shapeType);
    Color getColor(String colorType);
}
