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

public class Final_variable_Ex1
{
	public static void main(String Args[])
	{
		System.out.println("Final variable showing error ") ; 
		A obj1=new A();
		obj1.x=60;
		
	}	
}

/*OUTPUT 
 cannot assign a value to final variable x
                obj1.x=60;
                    ^
*/
