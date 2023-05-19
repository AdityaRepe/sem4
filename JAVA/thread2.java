public class thread2{
	public static void main(String[] args)
	{
		ThreadC threadc=new ThreadC();
		ThreadB threadb=new ThreadB();
		threadc.start();
		threadb.start();
	}
}

class ThreadC extends Thread{
	@Override
	
	public void run() {
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
}

class ThreadB extends Thread{
	@Override
	
	public void run() {
		for(int i=6;i<=10;i++)
			System.out.println(i);
	}
}