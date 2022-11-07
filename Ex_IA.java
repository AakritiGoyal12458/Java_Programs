
interface IA
{
	public void show();
	public void cal(int p1,int p2);
}
interface IB
{
	public void show1();
	public void cal1(int p1,int p2);
}
interface IC
{
	public void show2();
	public void cal2(int p1,int p2);
}
interface ID
{
	public void show3();
	public void cal3(int p1,int p2);
}
class A implements IA 
{
	int x=10,y=20;
	public void display()
	{
		System.out.println("value of x is "+x +"value of y is " + y );
	}
	public void show(){}
	public void cal(int p1,int p2)
	{
		System.out.println("Sum of 2 numbers is " + (x+y));
	}
}
class C 
{
int x1=20,y2=30;
public void display1()
	{
		System.out.println("value of x1 is "+x1 +"value of y2 is " + y2 );
	}


}
class B extends C  implements IA ,IB, IC ,ID
{
	int x3=30,y3=40;
	public void display()
	{
		System.out.println("value of x3 is "+x3 +"value of y3 is " + y3 );
	}
	public void show(){}
	public void show1(){}
	public void cal1(int p1,int p2){}
	public void show2(){}
	public void cal2(int p1,int p2){}
	public void show3(){}
	public void cal3(int p1,int p2){}
	
	public void cal(int p1,int p2)
	{
		System.out.println("Sum of 2 numbers is " + (x3+y3));
	}
}
public class Ex_IA
{
	public static void main(String Args[])
	{
		B obj1=new B();
		obj1.display();
		obj1.cal(5,8);
	}
}

/*

o/p 
1. CLASS A OBJECT 
value of x is 10value of y is 20
Sum of 2 numbers is 30 
2. CLASS B O/P
value of x3 is 30value of y3 is 40
Sum of 2 numbers is 70 

*/