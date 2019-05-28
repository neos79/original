package multithreading;

/**
 * @author naveen.singh
 *
 * 
 */
public class SumFromDIfferentThreadOfDifferenctClass {

	public static void main(String[] args) {
		Thread t1=new Thread(new A1());
		Thread t2=new Thread(new A2());
		Thread t3=new Thread(new A3());
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			
			System.out.println(A1.a1sum+
					A2.a2sum+
					A3.a3sum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
class A1 implements Runnable{
	static int a1sum=0;
	@Override
	public void run() {
		for(int i=0;i<4;i++){
			a1sum=a1sum+i;
		}
		System.out.println("A1  6:"+a1sum);
	}
	
}

class A2 implements Runnable{
	static int a2sum=0;
	@Override
	public void run() {
		for(int j=1;j<5;j++){
			a2sum=a2sum+j;
			}
		System.out.println("A2  10:"+a2sum);
	}
	
}

class A3 implements Runnable{
	static int a3sum=0;
	@Override
	public void run() {
		for(int k=3;k<7;k++){
			a3sum=a3sum+k;
			}
		System.out.println("A3 18:"+a3sum);
	}
}
