abstract class Shape
{
	abstract void area(int length,int breadth);//prototype
	void perimeter(int length,int breadth)
	{
		float perimeter =2*(length+breadth);
		System.out.println(" perimeter of rectangle is "+perimeter ) ;
	}
}

class Rectangle extends Shape
{
	void area(int length,int breadth)
	{
		float area =length*breadth;
		System.out.println("Area of rectangle is "+area);
	}
}

class abstract_example
{ 
	public static void main(String args[])
	{
		Rectangle ob1=new Rectangle();
		ob1.area(4,5);
		ob1.perimeter(4,5);
	}
}