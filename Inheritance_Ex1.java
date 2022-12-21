class A 
{
	public A()
	{
		System.out.println("I am parent class");
	}

}
class B extends A
{
	public B()
	{
		System.out.println("I am child class");
	}
}
public class Inheritance_Ex1
{
	public static void main(String Args[])
	{
		System.out.println("I am Example of single inheritance ");
		B obj2=new B();
	}	
}
