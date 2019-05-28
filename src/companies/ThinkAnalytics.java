package companies;
/**
 * @author naveen.singh
 *1-if you are saving child object in parent type reference and call child method with
 *that reference then that method needs to present in Parent as well.
 *
 *2-A parent reference with its own object cannot be stored child reference
 *Ex. Parent p=new Parent();
 *Child c=p; Compile time{Type mismatch: cannot convert from Parent to Child}
 *but Child c=(Child)p; java.lang.ClassCastException: companies.P cannot be cast to companies.C  
 * 
 * 3-
 */
public class ThinkAnalytics {

	public static void main(String[] args) {
		P p=new P();
		//p.myMethod();//will call parent method
		
		P p1=new C();
		//p1.myMethod();// will call child method
		
		P p2=new C();//
		//C c1=p2; // Type mismatch: cannot convert from P to C
		
		P p3=new C();//
		C c2=(C)p3;
		//c2.myMethod();
		
		P p4=new C();//
		
		//p4.myMethod();
		
		P p5=new C();
		C c5=(C)p5;
		//c5.yourMethod();
		
		P p6=new P();
		C c6=(C)p6;
		c6.yourMethod();
		
		
		
		
	}

}


class P{

	void myMethod() {
		System.out.println("Parent method");
	}
	void yourMethod() {
		System.out.println("Parent method");
	}
	
}
class C extends P{
	void myMethod(){
		System.out.println("Child method");
	}
	
	void yourMethod() {
		System.out.println("Parent method");
	}
}