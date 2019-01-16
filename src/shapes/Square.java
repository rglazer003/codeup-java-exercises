package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        System.out.println("Its working");
        return (Math.pow(this.length, 2));
    }

    public double getPerimiter() {
        System.out.println("Its working");
        return (4 * this.length);
    }
}
