package Threads;

public class ThreadDemo extends Thread {
	
	public ThreadDemo(String name)
	{
		super(name);
	}

	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("first-thread"); //new state
		ThreadDemo t2 = new ThreadDemo("second-thread"); //new state
		ThreadDemo t3 = new ThreadDemo("third-thread"); //new state

		t1.start(); //runnable state
		t2.start(); //runnable state
		t3.start(); //runnable state
	}
}
