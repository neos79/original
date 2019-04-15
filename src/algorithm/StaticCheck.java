package algorithm;
/**
 * @author naveen.singh
 *
 * 
 */
public class StaticCheck {
	final static int j=3;
	public static void main(String[] args) {
		final Ri ri=new Ri();
		//ri=new Ri();
		ri.i=11;
		System.out.println(ri.i); 
	}

}
class Ri{
	int i=10;
}
class Mi{
	
}