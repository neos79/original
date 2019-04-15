package coreJava.Interface;
/**
 * @author naveen.singh
 *
 * 
 */
public class MyInterface implements I1,I2 {

	/*@Override
	public void meth2() {
		I1.super.meth2();
	}*/
	public static void main(String[] args) {
		MyInterface m=new MyInterface();
		//m.meth2();
		I2.meth1();
		
	}
	
}
interface I1{
	static void meth1() {
		System.out.println("I1 static meth1");
	}
	default void meth2(){
		System.out.println("I1 defualt meth2");
	}
	
}
interface I2{
	static void meth1() {
		System.out.println("I2 static meth1");
	}
	default void meth3(){
		System.out.println("I2 defualt meth2");
	}
	default void meth4(){
		System.out.println("I2 defualt meth2");
	}
	
}
