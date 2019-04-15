package test;

public interface I3 extends I1 {
	public void meth1();
	default void show(){
		System.out.println("interface I3 default");
	}
}
