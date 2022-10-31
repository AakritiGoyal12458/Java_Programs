public class ExException1
{
	public static void main(String s[])
	{
		int x,y,z;
		x=s[0];
		y=s[1];
		z=x+y;
		System.out.println(" Sum ="+z);
	}
}

/*
o/p 
ExException1.java:6: error: incompatible types: String cannot be converted to int
                x=s[0];
                   ^
ExException1.java:7: error: incompatible types: String cannot be converted to int
                y=s[1];
                   ^
2 errors
*/