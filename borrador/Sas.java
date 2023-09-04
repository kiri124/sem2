package borrador;

public class main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 3.0);

        double areaOfCircle = circle.calculateArea();
        double areaOfRectangle = rectangle.calculateArea();

        System.out.println("Area of Circle: " + areaOfCircle);
        System.out.println("Area of Rectangle: " + areaOfRectangle);
    }
}
//System.out.println(osito.Formita("grande"));