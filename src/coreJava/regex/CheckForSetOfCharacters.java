package coreJava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForSetOfCharacters {

	public static void main(String[] args) {

		System.out.println(validatePANset("DONJS4138M"));

	}
	public static boolean validatePANset(String pan){
		boolean isValidPAN = false;
		Matcher matcher = Pattern.compile("[PCFTHLJ]*").matcher(String.valueOf(pan.charAt(3)));
		if (matcher.matches())
			isValidPAN = true;
		else
			isValidPAN = false;
		
		return isValidPAN;
	}
}
