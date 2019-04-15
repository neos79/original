package test;

public class I4 implements I2,I3{

	public static void main(String[] args) {
		A2 a2=new A2();
		a2.meth1();
		
	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		
	}

	

}
class A2 implements I2 {
	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		
	}	
}

class A3{
	
}