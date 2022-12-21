final class A 
{
	public A()
	{	
		System.out.println("Constructor of class A " );
	}
	void show() 
	{
		System.out.println("A");
	}
}
class B extends A 
{
	public B()
	{	
		System.out.println("Constructor of class B" );
	}
	void show()
	{
		System.out.println("B" );
	}
}


public class Final_Class
{
	public static void main(String Args[])
	{
		System.out.println("declaring class as final to avoid inheritance ") ; 
		A obj1=new A();
		obj1.show();
		
		
	}	
}

/*OUTPUT 
error: cannot inherit from final A
class B extends A
                ^
1 error
*/
