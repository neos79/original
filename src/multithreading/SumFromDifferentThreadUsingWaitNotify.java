package multithreading;
/**
 * @author naveen.singh
 *
 * 
 */
//incomplete
public class SumFromDifferentThreadUsingWaitNotify {

	public static void main(String[] args) {
		Neo n1=new Neo(5);
		n1.start();
		Neo n2=new Neo(3);
		n2.start();
		Neo n3=new Neo(2);
		n3.start();
		System.out.println(n1.sum+n2.sum+n3.sum);
	}

}

class Neo extends Thread{
	int n;
	 int sum=0;
	
	Neo(int num){
		this.n=num;
	}
	
	public void run() {
		sum=n*(n+1)/2;
		synchronized (this) {
			this.notify();
		}
	}
}

