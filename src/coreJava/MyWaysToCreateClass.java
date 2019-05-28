package coreJava;
import coreJava.N;
/**
 * @author naveen.singh
 *
 * 
 */
public class MyWaysToCreateClass {
	public static void main(String[] args) {
		N n1=new N(1);
		System.out.println(n1.getJ());
		
		try {
			N n2=(N)Class.forName("coreJava.N").newInstance();
			System.out.println(n2.getJ());
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	
}