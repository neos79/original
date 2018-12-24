package coreJava.reflection;

import java.lang.reflect.Method;

public class MyReflection {
	
	public static void main(String[] args) {
	//	Method[] methods = Rish.class.getMethods();
		Method[] methods=null;
		try {
			Rish obj= (Rish)Class.forName("reflection.Rish").newInstance();
			obj.method1();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			methods = Class.forName("reflection.Rish").getMethods();
		} catch (SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		for(Method method : methods){
		   // System.out.println("method = " + method.getName());
		}

	}
	
}

class Rish{
	int i;
	public void method1(){
		System.out.println("method1");
	}
	public void method2(){
		System.out.println("method2");
	}
	public void method3(){
		System.out.println("method3");
	}
}
