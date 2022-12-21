public class ThreadExample3 extends Thread
{
	public static void main(String s[])
	{
		Thread th = currentThread();
		System.out.println(" Status = " +th);
		System.out.println(" Name = " + th.getName());	
		System.out.println(" Priority  = " +th.getPriority());
		System.out.println(" id = " +th.getId());
		th.setPriority(8);
		th.setName("My Thread");	
		System.out.println(" New Status = " +th);	

		Thread th1 = new Thread("Thread 1 ");
		System.out.println(" Name = " + th1.getName());
		System.out.println(" minimum priority = " + Thread.MIN_PRIORITY);
		System.out.println(" maximum priority = " + Thread.MAX_PRIORITY);
		System.out.println(" Normal priority = " + Thread.NORM_PRIORITY);		
	}
}