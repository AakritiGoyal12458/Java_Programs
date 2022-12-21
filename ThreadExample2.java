class Thread1 implements Runnable
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

class Thread2 implements Runnable
{
	
	public void run()
	{
		int i=1;
		while(i<40000)
		{
			System.out.println("MMMMMMMMMMMMMMM");
			i++;
		}
	}
}

class ThreadExample2
{
	public static void main(String args[])
	{
		Thread1 ob1 =new Thread1();
		Thread hey=new Thread(ob1);
		Thread2 ob2 =new Thread2();	
		Thread heya=new Thread(ob2);
		
		hey.start();
		heya.start();
	}
}