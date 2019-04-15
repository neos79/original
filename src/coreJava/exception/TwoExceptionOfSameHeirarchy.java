package coreJava.exception;
/**
 * @author naveen.singh
 *
 * 
 */
public class TwoExceptionOfSameHeirarchy {
	static Integer i;
	public static void main(String[] args) {
		try {
			System.out.println(i.doubleValue());
		} /*catch (NullPointerException|RuntimeException e) {
			// two exception of the same hierarchy
		}*/
		finally{
			
		}
	}

}
