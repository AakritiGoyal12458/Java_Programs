class A 
{
	int x ; 
	public A()
	{
		x=10; 
	}
	void show() //not public still accessible 
	{
		System.out.println("X="+x);
	}

}
class B extends A
{
	int y ; 
	public B()
	{
		y=20; 
	}
	void display()
	{
		System.out.println("Y="+y);
	}
}

public class Inheritance_Ex3
{
	public static void main(String Args[])
	{
		System.out.println("Focus on display and show function ");
		System.out.println("Acessing method with object ");
		B obj1=new B();
		obj1.show();
		obj1.display();
		System.out.println("Acessing varibale with object ");
		System.out.println("VALUE OF Y using obj1.y  ="+obj1.y);
		System.out.println("VALUE OF X using obj1.x  ="+obj1.x);
			
		
	}	
}

/*OUTPUT 
I am Example of multi level inheritance
I am parent class A
I am child class B
I am child class C*/
