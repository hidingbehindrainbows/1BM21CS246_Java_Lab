abstract class Shape
{
	int one; int two;
	void initial(int o, int t)
	{
		one = o; two = t;
	}
	abstract void printArea();
}

class Rectangle extends Shape
{
	void printArea()
	{
		System.out.println("The area of the rectangle is:\t"+ one*two);
	}
}

class Triangle extends Shape
{
	void printArea()
	{
		System.out.println("The area of the triangle is:\t"+ (double)0.5*one*two);
	}
}

class Circle extends Shape
{
	void printArea()
	{
		System.out.println("The area of the circle is:\t"+ (double) 3.14159*one*two);
	}
}

class Areas
{
	public static void main(String args[])
	{
		Triangle t1 = new Triangle();
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		t1.initial(50, 40); t1.printArea();
		r1.initial(100, 60); r1.printArea();
		c1.initial(50, 50); c1.printArea();
	}
}
	