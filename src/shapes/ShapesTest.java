package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myshape;
        Rectangle rectangle1 = new Rectangle(7,3);
        Square square1 = new Square(8);
        System.out.println(square1.getArea());
        System.out.println(rectangle1.getPerimeter());
        myshape = new Square(8);
        System.out.println(((Square) myshape).getWidth());
    }
}
