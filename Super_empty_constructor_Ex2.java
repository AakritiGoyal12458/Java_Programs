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
		super();
	}
	void display()
	{
		System.out.println("display child mwthod" );
	}
	
}



public class Super_empty_constructor_Ex2
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
super cannot be called in method after print statement ; 
                     ^
*/
