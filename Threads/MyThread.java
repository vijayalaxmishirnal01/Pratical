package Threads;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		MyThread mt =new MyThread();
		Thread th =new Thread(mt,"My Thread");
		
		th.start();

	}
}
