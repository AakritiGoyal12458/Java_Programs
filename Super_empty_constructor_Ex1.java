class A 
{
	
	public A()
	{
		System.out.println("Constructor of class A " );
		
	}
	void show() //not public still accessible 
	{
		System.out.println("show parent mwthod" );
	}

}
class B extends A
{	

	
	public B()
	{
		System.out.println("Constructor of class B " );
	}
	void display()
	{
		super();	
	}
	
}



public class Super_empty_constructor_Ex1
{
	public static void main(String Args[])
	{
		
		B obj1=new B();
		System.out.println("calling empty constructor super in  ") ; 
		obj1.display();
	}	
}

/*OUTPUT 
 error: call to super must be first statement in constructor
                super();
                     ^
*/
