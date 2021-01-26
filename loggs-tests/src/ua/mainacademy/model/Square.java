package ua.mainacademy.model;

public class Square implements Shape {

    public int side;

    public Square() {
    }

    public Square(int radius) {
        this.side = radius;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.PI* side * side;
    }
}
