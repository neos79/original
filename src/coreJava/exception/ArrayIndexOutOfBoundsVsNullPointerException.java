package coreJava.exception;
/**
 * @author naveen.singh
 *
 * 
 */
public class ArrayIndexOutOfBoundsVsNullPointerException {

	public static void main(String[] args) {
		try{
		System.out.println(args[0]);
		}catch(ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}

	}

}
