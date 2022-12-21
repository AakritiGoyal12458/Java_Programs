class A
{
	public static void show() // static block 
	{		
		A ob1=new A();
		System.out.println("show method");
		ob1.disp();
	}

	public static void disp() // static block 
	{
		System.out.println("display method");
	}
}

public class Static8
{
	public static void main(String[] args)
	{
		System.out.println("program to show non static data is not directly callabale outside class even with object so we have to create object in class itself ");
		
		A.show();
	}

}

/*o/p 
program to show non static data is not directly callabale outside class even with object so we have to create object in class itself
show method
display method
*/