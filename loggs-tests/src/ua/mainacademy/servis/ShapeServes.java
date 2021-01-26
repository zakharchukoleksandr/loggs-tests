package ua.mainacademy.servis;

import java.awt.*;
import java.util.logging.Logger;

import ua.mainacademy.model.Shape;

public class ShapeServes {

    private static final Logger LOGGER=Logger.getLogger(ShapeServes.class.getName());

    public static Double getArea(Shape shape) {
        LOGGER.info("Shape is "+shape.getClass().getSimpleName());
        return shape.getArea();
    }
}
