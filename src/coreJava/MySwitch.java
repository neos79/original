package coreJava;
/**
 * @author naveen.singh
 *
 * 
 */
public class MySwitch {

	public static void main(String[] args) {
		int _int = 3;
		short _short = 4;
		char _char = 'p';
		String _str="s";

		long _long= 388;
		Boolean _Boolean = true;
		//Cannot switch on a value of type long. Only convertible int/short/char values, strings or enum 
		//variables are permitted
		switch(_str) {
	      default:
	        System.out.println("You choose correct option");
	    }

	}

}
