public class  Finally_ex_1
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
		
		finally
		{
			System.out.println(" error \n finally block always execute  ");
		}
		
	}
}

/*
o/p 1. 
 value of z is =5
 error
	finally block always execute

*/