class A 
{
	public A()
	{
		throw new AssertionError();
		
	}
	void show(){
		System.out.print("Aakriti gandu hai");
	}

}
class B extends A
{
	public B()
	{ 

		System.out.println("I am child class");
	}
}
public class ques
{
	public static void main(String Args[])
	{
		System.out.println("I am Example of single inheritance ");
		B obj2=B();
		
		
	}	
}
