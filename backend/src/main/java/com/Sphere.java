package com;

public class Sphere {
    static final double PI = 3.14;
    static int count = 0;
    double radius;
    double xCenter;
    double yCenter;
    double zCenter;

    static int getCount() {
        return count;
    }

    double volume() {
        return 4.0 / 3.0 * PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.setRadius(10);//设置半径
        System.out.println(s.volume());
    }
}
