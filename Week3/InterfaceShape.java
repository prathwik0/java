/*
 * Write a java program to create an interface named Shape that contains empty
 * method named Area () and perimeter(). Provide two classes named Triangle and
 * Circle such that each one of the classes implement Shape. Each one of the
 * classes contains only the method Area () and perimeter().that prints the area
 * and perimeter() of the given shape.
 */

interface Shape {

    void Area();

    void perimeter();
}


// Triangle class
class Triangle implements Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void Area() {
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area);
    }

    public void perimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
}


// Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void Area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    public void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + perimeter);
    }
}


// Main class
public class InterfaceShape {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 4, 3, 4, 5);
        triangle.Area();
        triangle.perimeter();

        Circle circle = new Circle(3);
        circle.Area();
        circle.perimeter();
    }
}
