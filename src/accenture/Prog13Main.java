package accenture;

import java.util.Random;

class Thread11 extends Thread {
	public void run() {
		while (true) {
			Random r = new Random();
			int n = r.nextInt(100);
			System.out.println("number generated+" + n);
			if (n % 2 == 0) {
				Thread12 t2 = new Thread12(n);
				t2.start();
			} else if (n % 2 != 0) {
				Thread13 t3 = new Thread13(n);
				t3.start();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.print(e.getMessage());
			}
		}
	}
}

class Thread12 extends Thread {
	int x;

	Thread12(int n) {
		x = n;
	}

	public void run() {
		System.out.println("square of random int generated is:" + (x * x));
	}
}

class Thread13 extends Thread {
	int x;

	Thread13(int n) {
		x = n;
	}

	public void run() {
		System.out.println("cube of random int generated is:" + (x * x * x));
	}
}

public class Prog13Main {

	public static void main(String[] args) {
		Thread11 t1 = new Thread11();
		t1.start();

	}

}
