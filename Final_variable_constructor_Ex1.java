class A 
{
	 // final int x ;   error: variable x might not have been initialized 
	//as sson as object is created constructor is called so we can initialixze with constructor 

	final int x ; 
	public A()
	{
		
		System.out.println("Constructor of class A " );
		x=10;
		
	}
	void show() //not public still accessible 
	{
		System.out.println("value of x is "   + x );
	}

}



public class Final_variable_constructor_Ex1
{
	public static void main(String Args[])
	{
		System.out.println("declaring variable as final with constructor  ") ; 
		A obj1=new A();
		obj1.show();
		
		
	}	
}

/*OUTPUT 
declaring variable as final with constructor
Constructor of class A
value of x is 10
*/
