package designPattern.singleton;
/**
 * @author naveen.singh
 *
 * 
 */
public class LazySingleton {
	public static void main(String[] args) {
		System.out.println(Ay.getAyInstance());
		System.out.println(Ay.getAyInstance());
		System.out.println(Ay.getAyInstance());
	}

}
class Ay{
	static Ay ay;
	Ay(){
		System.out.println("Ay created");
	}
	public static Ay getAyInstance(){
		if(null==ay){
			ay=new Ay();
		}
		return ay;
	}
}