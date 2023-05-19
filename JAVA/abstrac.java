
abstract class Shape{
	abstract double area();
}

class Circle extends Shape{
	 private double radius;
	    Circle(int rd) {
	        this.radius = rd;
	    }

	    double area() {
	        return (Math.PI * radius * radius);
	    }
}

class Rectangle extends Shape{
	private double length;
	private double breadth;
	Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	double area()
	{
		return (length*breadth);
	}
}

class Triangle extends Shape{
	private double length;
	private double height;
	Triangle(int l,int h)
	{
		this.length=l;
		this.height=h;
	}
	double area()
	{
		return (0.5*length*height);
	}
}

public class abstrac {

	public static void main(String[] args)
	{
		Shape circle=new Circle(5);
		System.out.println("Area of circle: " + circle.area());
		Shape rect=new Rectangle(5,4);
		System.out.println("Area of Rectangle: " + rect.area());
		Shape tri=new Triangle(5,4);
		System.out.println("Area of Triangle: " + tri.area());
	}
}
