package shapes;

import util.Input;


public class Circle {
    private double radius;
    private static int loop;

    public double getArea() {
        return (Math.PI * (Math.pow(radius, 2)));
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void loopBoost() {
        loop++;
    }

    public static int shoutItOut() {
        return loop;
    }

    public static void makeCircle() {
        boolean loop;
        do {
            System.out.println("Input radius");
            double rad = Input.getDouble();
            Circle circle = new Circle(rad);
            Input.reset();
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
            loopBoost();
            loop = Input.yesNo();
        } while (loop);
        System.out.println("Circles made: " + shoutItOut());
    }
}

