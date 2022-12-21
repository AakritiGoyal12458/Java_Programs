class A
{
	public A()
	{
		System.out.println("I am non parameterized contructor");
	}
	public A(int a)
	{
		System.out.println("I am parameterized contructor storing a value as " + a);
	}

}

public class Constructor_Ex1 
{
	public static void main(String Args[])
	{
		System.out.println("This is ex of constructor overloading");
		A obj1  = new A();
		A obj2  = new A(10);

	}
}

/*O/P : I am non parameterized contructor
I am parameterized contructor storing a value as 10*/