class A 
{
	int x ; 
	public A()
	{
		x=10; 
	}
	void display() //not public still accessible 
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
	void display()
	{
		super.display();
		System.out.println("Y is " + y ) ; 
	}
	
}



public class Super_Method_Name
{
	public static void main(String Args[])
	{
		
		B obj1=new B();
		obj1.display();
	}	
}

/*OUTPUT 
X=10
Y is 20
*/
