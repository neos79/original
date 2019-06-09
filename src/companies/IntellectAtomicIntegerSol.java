package companies;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author naveen.singh
 *
 * 
 */
public class IntellectAtomicIntegerSol {

	public static void main(String[] args) {
		ProcessingThreadR pt = new ProcessingThreadR();

		Thread t1 = new Thread(pt, "t1");

		t1.start();

		Thread t2 = new Thread(pt, "t2");

		t2.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Processing count=" + pt.getCount());

	}

}

class ProcessingThreadR implements Runnable {

	private AtomicInteger count = new AtomicInteger();

	@Override

	public void run() {

		for (int i = 1; i < 5; i++) {

			processSomething(i);

			count.incrementAndGet();

		}

	}

	public int getCount() {

		return this.count.get();

	}

	private void processSomething(int i) {

		// processing some job

		try {

			Thread.sleep(i * 1000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

}
