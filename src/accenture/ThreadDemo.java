package accenture;

class MyThread implements Runnable{
	String name;
	Thread thread;
	MyThread(String name){
		this.name=name;
		thread=new Thread(this,name);
		System.out.println("New Thread:"+thread);
		thread.start();
	}
	public void run() {
		try {
		for(int i=5;i>0;i--) {
		System.out.println("child thread:"+i);
		Thread.sleep(1000);
		}
		}
		catch(InterruptedException e) {
			System.out.println(name+" Interrupted");
		}
		System.out.println(name+" Exiting");
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1=new MyThread("One");
		MyThread t2=new MyThread("Two");
		MyThread t3=new MyThread("Three");
		System.out.println("Thread One is alive:"+t1.thread.isAlive());
		System.out.println("Thread Two is alive:"+t2.thread.isAlive());
		System.out.println("Thread Three is alive:"+t3.thread.isAlive());
		/*try {
			/*t1.thread.join();
			t2.thread.join();
			t3.thread.join();*/
		/*}
		catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}*/
		System.out.println("Thread One is alive:"+t1.thread.isAlive());
		System.out.println("Thread Two is alive:"+t2.thread.isAlive());
		System.out.println("Thread Three is alive:"+t3.thread.isAlive());
		System.out.println("Main Thread is exiting");
	}

}
