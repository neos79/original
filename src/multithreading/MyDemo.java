package multithreading;

public class MyDemo {
	static Thread s;

	public static void main(String[] args) throws InterruptedException {
		A a1 = new A("threadA");
		a1.start();

		System.out.println(":: Waiting for A to notify ::");
		synchronized (a1) {
			a1.wait();
			System.out.println("::A Notified ::" + a1.x);
		}

	}
}

class A extends Thread {
	int x;

	A(String name) {
		super(name);
	}

	public A() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			x = x + i;
			System.out.println("inside A  :" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		A abb=new A();
		synchronized (abb) {
			//this.notify();
			
			abb.notify();
		}

	}
}
