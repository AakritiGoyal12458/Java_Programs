class Thread1 extends Thread
{
	
	public void run()
	{
		int i=1;
		while(i<40000)
		{
			System.out.println("heyyy");
			i++;
		}
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		int i=1;
		while(i<40000)
		{
			System.out.println("I love you keshav ");
			i++;
		}
	}
}

class ThreadExample1 
{
	public static void main(String args[])
	{
		Thread1 ob1 =new Thread1();
		Thread2 ob2 =new Thread2();	
		ob1.start();
		ob2.start();
	}
}