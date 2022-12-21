class A 
{
	public A()
	{
		System.out.println("I am parent class A" );
	}

}
class B extends A
{
	public B()
	{
		System.out.println("I am child class B");
	}
}
class C extends B
{
	public C()
	{
		System.out.println("I am child class C");
	}
}
public class Inheritance_Ex2
{
	public static void main(String Args[])
	{
		System.out.println("I am Example of multi level inheritance ");
		C obj2=new C();
	}	
}

/*OUTPUT 
I am Example of multi level inheritance
I am parent class A
I am child class B
I am child class C*/
