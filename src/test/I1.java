package test;

public interface I1 {
	public void meth1();
	default void show(){
		System.out.println("I1 default");
	}
}
