package java8;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author naveen.singh
 *1.lambda Expression( is an anonymous function-nameless,
 *		without return type & without modifiers)
 *  to bring benefit of functional programming into java
 *2.Functional Interfaces
 *	eg. Runnable,Comparable,ActionListener,Callable,CompareTo
 *3.Predefined Functional Interfaces
 *	.Predicate
 *	Function
 *	Consumer
 *	Supplier
 *4.Double Colon Operator(::)
 * 	 Method reference
 * 	 Constructor reference
 *5.Streams
 *6.Date and Time API
 *7.Optional
 *8.Nashorn JavaScript Engine
 */
public class DurgaJava8 {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));

		evenOrNot();
	}
	
	public static void evenOrNot(){
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(5));
	} 

}
