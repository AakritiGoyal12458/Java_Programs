public class Static3
{	
	int x=10;
	public static void main(String[] args)
	{
	System.out.println("showing non static data is  accesible in static context by creating object in same class" );
	Static3 obj1=new Static3();
	
	System.out.println("value of x is " + obj1.x ) ;
	}
}

/*output
showing non static data is  accesible in static context by creating object in same class
value of x is 10
*/