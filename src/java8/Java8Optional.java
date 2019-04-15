package java8;

import java.util.HashMap;
import java.util.Optional;

/**
 * @author naveen.singh
 *
 * 
 */
public class Java8Optional {

	public static void main(String[] args) {
		/*String[] words = new String[10];   
        String word = words[5].toLowerCase();   
        System.out.print(word);   
		*/
		
		String[] stringArray=new String[10];
		Optional<String> nullCheck=Optional.ofNullable(stringArray[5]);
		if(nullCheck.isPresent()){
			System.out.println("not Null--");
		}else{
			System.out.println("null---");
		}
		}
	}
	

