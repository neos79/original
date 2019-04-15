package coreJava.exception;
/**
 * @author naveen.singh
 *
 * 
 */
public class RuntimeInsideCatch {

	public static void main(String[] args) {
			try{
				print("1.0");
			}catch(Exception e){
				System.out.println(e);
			}

	}
	public static void print(String s){
		try{
			System.out.println(Integer.parseInt(s));
		}catch(NumberFormatException e){
			System.out.println("A");
			try{
			//throw new RuntimeException();
			}catch(Exception ee){
				System.out.println(ee);
			}
		}finally{
			System.out.println("B");
		}
	}

}
