/*
 * To create an abstract class named Shape that contains two integers and an
 * empty method named printArea. Provide three classes named Rectangle, Triangle
 * and Circle subclass that each one of the classes extends the Class Shape.
 * Each one of the classes contains only the method printArea() that prints the
 * area of Shape.
 */

package AbstractClass;

abstract class Shape {
    public int x, y;

    public abstract void printArea();
}


class Rectangle extends Shape {
    public void printArea() {
        System.out.println("Area of Rectangle is " + x * y);
    }
}


class Triangle extends Shape {
    public void printArea() {
        System.out.println("Area of Triangle is " + (x * y) / 2);
    }
}


class Circle extends Shape {
    public void printArea() {
        System.out.println("Area of Circle is " + (22 * x * x) / 7);
    }
}


public class Main {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        r.x = 10;
        r.y = 20;
        r.printArea();

        System.out.println("-------------------------------------");

        Triangle t = new Triangle();
        t.x = 30;
        t.y = 35;
        t.printArea();

        System.out.println("-------------------------------------");

        Circle c = new Circle();
        c.x = 2;
        c.printArea();

        System.out.println("-------------------------------------");
    }
}
