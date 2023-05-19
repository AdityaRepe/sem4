
class ThreadA extends Thread{
	char thr;
	
	void setChar(char x)
	{
		this.thr=x;
	}
	
	@Override
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello from Thread "+thr);
		}
	}
}




public class thread1{
	public static void main(String[] args)
	{
		ThreadA threada=new ThreadA();
		threada.setChar('a');
		ThreadA threadb=new ThreadA();
		threadb.setChar('b');
		threada.start();
		threadb.start();
	}
}