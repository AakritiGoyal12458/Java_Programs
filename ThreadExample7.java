class Thread1 extends Thread
{
	public Thread1(String name)
	{
		super(name);
		System.out.println(getPriority());
		setPriority(MAX_PRIORITY);
		System.out.println(getPriority());
	}
	public void run()
	{
		int i=2;
		while(i<=800)
		{
			System.out.println("Good Morning");
			System.out.println(this.getName());
			try
			{
				sleep(200);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			i++;
		
		}
	}

}
class Thread2 extends Thread
{
	public Thread2(String name)
	{
		System.out.println(getPriority());
		
	}
	public void run()
	{
		while(true)
		{
			System.out.println("Welcome");
			
		}
	}

}
class ThreadExample7
{
	public static void main(String[] a)
	{
		Thread1 th1 =new Thread1("aakriti");
		Thread2 th2 =new Thread2("keshav");
		th1.start();	
		th2.start();	
		th2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(th2.getPriority());
		System.out.println(th2.getState());
		System.out.println(Thread.currentThread().getState());

	}
}