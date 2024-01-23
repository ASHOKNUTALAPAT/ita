package accenture;

class Account {
	int balance;

	public Account() {
		balance = 5000;
	}
	
	public synchronized void withdraw(int bal) {
		try {
			Thread.sleep(1000);
		} catch (Exception ex) {
			System.out.println("EXCEPTION OCCURED.." + ex);
		}
		balance = balance - bal;
		System.out.println("Balance remaining:::" + balance);
	}
}

class C implements Runnable {
	Account obj;

	public C(Account a) {
		obj = a;
	}

	public void run() {
		obj.withdraw(500);
	}
}

class ThreadSync1 {
	public static void main(String args[]) {
		Account a1 = new Account();
		C c1 = new C(a1);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c1);
		t1.start();
		t2.start();
	}
}

