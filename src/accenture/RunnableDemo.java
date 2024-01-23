package accenture;
//creating a thread with Runnable interface
class MyThread1 implements Runnable{
	public void run() {
		System.out.println("Thread Created..."+Thread.currentThread().getName());
		for(int i=1;i<=10;i++)
			System.out.println(Thread.currentThread().getName()+":"+i);
	}
}

public class RunnableDemo {
	public static void main(String[] args)throws Exception {
		MyThread1 thread1=new MyThread1();
		Thread t1=new Thread(thread1,"Child1");
		
		MyThread1 thread2=new MyThread1();
		Thread t2=new Thread(thread2,"Child2");
		
		t1.start();
		t2.start();
		Thread.sleep(1000);
		System.out.println("End of Main...");
	}

}
