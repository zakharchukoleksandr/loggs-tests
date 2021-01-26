package ua.mainacademy;


import ua.mainacademy.model.Circle;
import ua.mainacademy.model.Square;
import ua.mainacademy.servis.ShapeServes;

import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER=Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Circle circle=new Circle(10);
        Square square=new Square(25);

        LOGGER.info("Area of two shapes is"+
                Double.sum(ShapeServes.getArea(circle), ShapeServes.getArea(square))
                //Double.valueOf(Double.sum(ShapeServes.getArea(circle).doubleValue(), ShapeServes.getArea(square))).doubleValue()

                );
    }

}
