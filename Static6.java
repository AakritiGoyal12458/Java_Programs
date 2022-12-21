class A
{
	public static void show() // static block 
	{
		System.out.println("show method");
		disp();
	}
	public static void disp() // static block 
	{
		System.out.println("display method");
	}
}

public class Static6
{
	public static void main(String[] args)
	{
		System.out.println("program to show static data is callabale in static block ");
		A obj1=new A();
		obj1.show();
	}

}

/*o/p 
program to show static data is callabale in static block
show method
display method
*/