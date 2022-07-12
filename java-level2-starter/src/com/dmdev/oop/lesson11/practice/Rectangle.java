package com.dmdev.oop.lesson11.practice;

public class Rectangle {
    private Point cornerLeft;
    private Point cornerRight;

    public Rectangle(Point cornerLeft, Point cornerRight) {
        this.cornerLeft = cornerLeft;
        this.cornerRight = cornerRight;
    }

    public Point getCornerLeft() {
        return cornerLeft;
    }

    public void setCornerLeft(Point cornerLeft) {
        this.cornerLeft = cornerLeft;
    }

    public Point getCornerRight() {
        return cornerRight;
    }

    public void setCornerRight(Point cornerRight) {
        this.cornerRight = cornerRight;
    }

    public double getDiagonal() {
        return cornerLeft.distance(cornerRight);
    }

    public int getArea() {
        return (cornerRight.getX() - cornerLeft.getX()) * (cornerLeft.getY() - cornerRight.getY());
    }
}
