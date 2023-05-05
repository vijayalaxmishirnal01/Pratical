package Threads;

public class ThreadEx extends Thread{

	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try {
				//sleep method is used to hold the thread for some time
				Thread.sleep(500); //500 milliseconds
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		System.out.println(i+" "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	}
	
	public static void main(String[] args) {
	
		ThreadEx t1 = new ThreadEx(); //new state
		ThreadEx t2 = new ThreadEx(); //new state
		ThreadEx t3 = new ThreadEx(); //new state
		ThreadEx t4 = new ThreadEx(); //new state

		/*
		  t1.start(); //runnable state
		//t1.start(); //it will throw an exception IllegalThreadStateException
		try {
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		t2.start();
		t3.start();
		t4.start();
		*/
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t4.setName("Thread-4");
		
		//priority can only be set between 1 to 10
		t1.setPriority(MAX_PRIORITY); //10
		t2.setPriority(MIN_PRIORITY); //1
		t3.setPriority(NORM_PRIORITY); //5 or default priority
		t4.setPriority(7); //7

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
