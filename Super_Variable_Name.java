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
	int x ,y ; 
	public B()
	{
		y=20; 
		x=20;
	}
	void show ()
	{
		System.out.println("Addition of 2 number ");
		System.out.println(" x=10(parent) and y=20(child)  ");
		System.out.println("x+y="+ (x+y));
		System.out.println(" x=10(parent) and x=20(child)  ");
		System.out.println("x+y="+ (x+x));

		System.out.println("we see prefrence is given to local varibale x=20 of child class so we got 40  ");
		System.out.println(" x=10(parent) and x=20(child) with super keyword  ");
		System.out.println("x+x="+ (super.x+x));
	}
	
}
public class Super_Variable_Name
{
	public static void main(String Args[])
	{
		
		B obj1=new B();
		obj1.show();
	}	
}

/*OUTPUT 
Addition of 2 number
 x=10(parent) and y=20(child)
x+y=40
 x=10(parent) and x=20(child)
x+y=40
we see prefrence is given to local varibale x=20 of child class so we got 40
 x=10(parent) and x=20(child) with super keyword
x+x=30
*/
