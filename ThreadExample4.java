class ThreadExample4 extends Thread
{
	public static void main(String s[])
	{
		int i;
		for(i=1;i<=5;i++)
		{
			System.out.println("Value of i is " +i );
			try
			{
			sleep(10000);
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
		}	
	}
}