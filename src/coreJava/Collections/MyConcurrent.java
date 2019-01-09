package coreJava.Collections;

import java.util.*;

class MyConcurrent extends Thread {
	static ArrayList<String> l = new ArrayList<String>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread" + " going to add element");
		}

		// Child thread trying to add new
		// element in the Collection object
		l.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("c");

		// We create a child thread that is
		// going to modify ArrayList l.
		MyConcurrent t = new MyConcurrent();
		t.start();

		// Now we iterate through the ArrayList
		// and get exception.
		Iterator<String> itr = l.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(l);
	}
}
