package multithreading;
/**
 * @author naveen.singh
 *
 * 
 */
public class SumFromDifferentThreadUsingJoin {

	public static void main(String[] args) {
		WorkerThreadN wh1=new WorkerThreadN(5);
		wh1.start();
		WorkerThreadN wh2=new WorkerThreadN(3);
		wh2.start();
		WorkerThreadN wh3=new WorkerThreadN(2);
		wh3.start();
		
		try {
			wh1.join();
			wh2.join();
			wh3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(wh1.sum+wh2.sum+wh3.sum);
	}

}

class WorkerThreadN extends Thread{
	int n;
	int sum;
	WorkerThreadN(int num){
		this.n=num;
	}
	@Override
	public void run(){
		sum=n*(n+1)/2;
	}
	
}
