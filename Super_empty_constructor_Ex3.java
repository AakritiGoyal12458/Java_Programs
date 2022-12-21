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
		super();
		System.out.println("Constructor of class B " );
		
	}
	void display()
	{
		System.out.println("display child mwthod" );
	}
	
}



public class Super_empty_constructor_Ex3
{
	public static void main(String Args[])
	{
		System.out.println("calling empty constructor super in child constrcutor as 1st statement  ") ; 
		B obj1=new B();
		
		
	}	
}

/*OUTPUT 
calling empty constructor super in child constrcutor as 1st statement
Constructor of class A
Constructor of class B
                     
*/
