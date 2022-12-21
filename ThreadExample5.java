class Thread1 extends Thread
{

	public Thread1 (String name)
	{
		super(name);
	}
	public void run()
	{
		int i=1;
		while(i<400)
		{
			System.out.println("i AM " + this.getName() );
			i++;
		}	
	
	}

}

class ThreadExample5 
{
	public static void main(String Args[])
	{
		Thread1 ob1 =new Thread1("chumma");	
		Thread1 ob2 =new Thread1("bada chumma");	
		Thread1 ob3 =new Thread1("chota chumma");	
		Thread1 ob4 =new Thread1("lamba chumma");
		ob1.setPriority(Thread.MAX_PRIORITY);
		ob2.setPriority(Thread.MIN_PRIORITY);
		ob3.setPriority(Thread.NORM_PRIORITY);
	
		ob1.start();
		ob2.start();
		ob3.start();
	

	
	}
}