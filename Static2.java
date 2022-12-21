public class Static2
{	
	int x=10;
	public static void main(String[] args)
	{
	System.out.println("showing non static data is not directly accesible in static context" );
	System.out.println("value of x is " + x ) ;
	}
}

/*output
error: non-static variable x cannot be referenced from a static context
        System.out.println("value of x is " + x ) ;
                                              ^
1 error
*/