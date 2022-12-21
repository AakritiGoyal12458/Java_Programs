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

public class Static7
{
	public static void main(String[] args)
	{
		System.out.println("program to show static data is callabale outside class even without object  ");
		A.show();
	}

}

/*o/p 
program to show static data is callabale outside class even without object
show method
display method
*/