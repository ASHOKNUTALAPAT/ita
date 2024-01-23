package accenture;
class Thread1 extends Thread{
	public void run() {
		System.out.println(this.getName()+"Thread started..."+this.getPriority());
		for(int i=1;i<=10;i++)
			System.out.println(this.getName()+":"+i);
		System.out.println("End of "+this.getName());
	}
}
public class ThreadClassDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" started");
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		t1.setName("VVIT-1");
		t2.setName("VVIT-2");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		
		t1.start();
		t2.start();
		
		System.out.println("End of Main");
	}

}
