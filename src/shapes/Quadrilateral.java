package shapes;

import shapes.Shape;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;
    public Quadrilateral (double length, double width){
        this.length = length;
        this.width = width;
    }

    public Quadrilateral() {
    }

    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}
