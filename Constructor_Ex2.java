class A
{	int x = 200; 
	
	public A()
	{
		//int y ; o/p x= 200
		
		x=100; 
	}
	public A(int p)
	{
		x=p; 
	}
	void show()
	{
		System.out.println("The value of X is " + x );
	}
}

public class Constructor_Ex2
{
	public static void main(String Args[])
	{
		System.out.println("This is ex of constructor calling");
		A obj1  = new A();
		obj1.show();
		A obj2  = new A(10);
		obj2.show();

	}
}

/*O/P : This is ex of constructor calling
The value of X is 100
The value of X is 10*/