public class  Exception_Handeling
{
	public static void main(String s[]) //String class in java so all inputs will be in string without typecasting 
	{
		try 
		{
		int x,y,z;
		x=Integer.parseInt(s[0]);
		y=Integer.parseInt(s[1]);
		z=x/y;
		System.out.println(" value of z is ="+z);
		}
		/* Bad way 
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		*/
		catch( ArithmeticException e)
		{
			System.out.println(" Divided by 0 ");
		}
		catch( ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Enter a number ");
		}
		catch( NumberFormatException e)
		{
			System.out.println(" Not a number ");
		}
	}
}

/*
o/p 1. 
 javac Exception_Handeling.java

java Exception_Handeling 10 0
 Divided by 0
o/p 2.
java Exception_Handeling 10
 Enter a number
o/p 3.
java Exception_Handeling 10 a
 Not a number

*/