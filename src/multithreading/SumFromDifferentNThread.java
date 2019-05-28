package multithreading;
/**
 * @author naveen.singh
 *
 * 
 */
public class SumFromDifferentNThread {

	public static void main(String[] args) {
		int[] array={5,3,2};
		WorkerThread [] whey=new WorkerThread[array.length];
		for(int i=0;i<array.length;i++){
			whey[i]=new WorkerThread(array[i]);
			whey[i].start();
		}
		try {
			for(int i=0;i<array.length;i++){
				whey[i].join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch blocka
			e.printStackTrace();
		}
		int finalsum=0;
		for(int i=0;i<array.length;i++){
			finalsum=finalsum+whey[i].sum;
		}System.out.println(finalsum);
	}
}
class WorkerThread extends Thread{
	int n;
	int sum;
	WorkerThread(int num){
		this.n=num;
	}
	@Override
	public void run(){
		sum=n*(n+1)/2;
	}
}
