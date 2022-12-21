class A 
{
	public A()
	{	
		System.out.println("Constructor of class A " );
	}
	final void show() 
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


public class Final_methodEx1
{
	public static void main(String Args[])
	{
		System.out.println("declaring method as final to avoid overridding ") ; 
		A obj1=new A();
		obj1.show();
		
		
	}	
}

/*OUTPUT 
error: show() in B cannot override show() in A
        void show()
             ^
  overridden method is final
1 error
*/
