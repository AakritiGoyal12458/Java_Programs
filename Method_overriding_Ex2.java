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
		System.out.println("Y="+y);
	}
	
}
class C extends B
{
	int z ; 
	public C()
	{
		z=30; 
	}
	void show ()
	{
		
		System.out.println("x+y+z=" + (x+y+z));
	}
	
}


public class Method_overriding_Ex2
{
	public static void main(String Args[])
	{
		System.out.println("Addition of 3 number using multi level inheritance  ");
		
		C obj1=new C();
		obj1.show();
	}	
}

/*OUTPUT 
Addition of 3 number using multi level inheritance 
x+y+z=60
*/
