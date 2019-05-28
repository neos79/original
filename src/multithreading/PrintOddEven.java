package multithreading;
/**
 * @author naveen.singh
 *
 * 
 */
public class PrintOddEven {
	public static void main(String[] args) {
		Print p1=new Print("p1");
		Print p2=new Print("p2");
		p1.start();
		p2.start();

	}
}


class Print extends Thread{
	public String name;
	Print(String name){
		this.name=name;
	}
	
	public void run(){
		for(int i=1;i<10;i++){
			if(i%2!=0){
				System.out.println(this.name+" :"+i);
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				
				System.out.println(this.name+" :"+i);
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.notify();
			}
		}
	}
}
