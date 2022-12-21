class A
{
	public void show() // non static block 
	{
		System.out.println("show method");
		disp();
	}
	public static void disp() // static block 
	{
		System.out.println("display method");
	}
}

public class Static5
{
	public static void main(String[] args)
	{
		System.out.println("program to show static data is callabale in non static block ");
		A obj1=new A();
		obj1.show();
	}

}

/*o/p 
program to show static data is callabale in non static block
show method
display method
*/