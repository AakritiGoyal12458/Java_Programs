class A 
{
	final int x=20; 
	public A()
	{
		System.out.println("Constructor of class A " );
		
	}
	void show() //not public still accessible 
	{
		System.out.println("value of x is "  + x );
	}

}

public class Final_variable_Ex2
{
	public static void main(String Args[])
	{
		System.out.println("Final variable is x   ") ; 
		A obj1=new A();
		obj1.show();
		
		
	}	
}

/*OUTPUT 
Final variable is x
Constructor of class A
value of x is 20
*/
