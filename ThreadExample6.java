class A extends Thread
{
	public A(String str)
	{
		super(str);
		System.out.println("Status=" + str);
		
		start();
	}
	public void run()
	{
		int i;
		for(i=1;i<=5;i++)
		{
			System.out.println("Value of i is " +i );
			try
			{
			sleep(1000);
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
		}
		System.out.println("Child Exited " + this.getName());	
	}
}

class B extends Thread
{
	public B(String str)
	{
		System.out.println("Status=" + str);
		start();
	}
	public void run()
	{
		int i;
		for(i=20;i<=25;i++)
		{
			System.out.println("Value of i is " +i );
			try
			{
			sleep(1000);
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
		}
		System.out.println("Child Exited ");	
	}
}

class ThreadExample6 
{
	public static void main(String Args[])
	{
		int j ; 
		try
		{
			A th1 = new A("keshav");
			for(j=20;j<=25;j++)
			{
				System.out.println("Value of j is " +j );
				Thread.sleep(10000);
			}
			System.out.println("Main  Exited ");
			B th2 = new B("Aakriti");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
	}
}