package java8.lambda;

import java.util.Arrays;
import java.util.List;

//though below have two method but normalFun() will not be counted for A being functional Interface
interface FuncInterface{
	// An abstract function 
    void abstractFun(int x); 
  
    // A non-abstract (or default) function 
    default void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
}
public class MyLambda {
	public static void main(String[] args) {
		// lambda expression to implement above functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = (int x)->System.out.println(2*x); 
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5); 
        
        // fobj can be passed without making 
        passFuntionalInterface(fobj);
        
        //FuncInterface can be passed to method of other class just like argument
        MyLambda1.MyLmabda1Method(fobj);
        
        
	}
	public static void passFuntionalInterface(FuncInterface fobj ){
		
		fobj.abstractFun(10);
	}
}

class MyLambda1{
	public static void MyLmabda1Method(FuncInterface fobj ){
		fobj.abstractFun(20);
	}
}


class MyLambda2{
	public static void MyLambda2Method(){
		Integer[] intArray={1,2,3,4};
		
		List<Integer> arrL = Arrays.asList(intArray);
		
        // Using lambda expression to print all elements 	
        // of arrL 
        arrL.forEach(n -> System.out.println(n)); 
  
        // Using lambda expression to print even elements 
        // of arrL 
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
	}
}
