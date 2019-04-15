package coreJava.exception;
/**
 * @author naveen.singh
 *
 * 
 */
public class CatchingOtherException {
	static Integer i=0;
	public static void main(String[] args) {
		try {
			int x=10;
			System.out.println(x%i.intValue());
		} catch (NullPointerException e) {
			System.out.println("E");
		}finally{
			System.out.println('F');
		}
	}

}
