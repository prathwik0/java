abstract class Shape {
    int length;
    int width;
    
    public abstract void printArea();
}

class Rectangle extends Shape {
    public void printArea() 
    {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public void printArea() 
    {
        double area = 0.5 * length * width;
        System.out.println("Area of Triangle : " + area);
    }
}

class Circle extends Shape {
    public void printArea() 
    {
        double area = 3.14 * length * length;
        System.out.println("Area of Circle   : " + area);
    }
}

public class AbstractClass
{
	public static void main(String[] args)
	{
		//TODO code application logic here
		Rectangle r = new Rectangle();
		r.length = 10;
		r.width = 20;
		r.printArea();
		System.out.println("...............................");
		Triangle t = new Triangle();
		t.length = 30;
		t.width = 35;
		t.printArea();
		System.out.println("................................");
		Circle c = new Circle();
		c.length = 25;
		c.printArea();
	}
}
