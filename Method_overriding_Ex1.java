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
	void show ()
	{
		//System.out.println("Y="+y);
		System.out.println("x+y=" + (x+y));
	}
	
}

public class Method_overriding_Ex1
{
	public static void main(String Args[])
	{
		System.out.println("Focus on show function ");
		System.out.println("parent method is override by child  so parent class show method is overridden function ");
		B obj1=new B();
		obj1.show();
	}	
}

/*OUTPUT 
Focus on show function
parent method is override by child  so parent class show method is overridden function
x+y=30
*/
