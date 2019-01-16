package coreJava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForSetOfCharacters {

	public static void main(String[] args) {
		//Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		System.out.println(validatePANset("DONJS4138M"));

	}
	public static boolean validatePANset(String pan){
		boolean isValidPAN = false;
		//Matcher matcher = Pattern.compile("[PCFTHLJ]*").matcher(String.valueOf(pan.charAt(3)));
		Matcher matcher = Pattern.compile("[*]{3}[PCFTHLJ]{1}[*]{6}").matcher(pan);
		if (matcher.matches())
			isValidPAN = true;
		else
			isValidPAN = false;
		
		return isValidPAN;
	}
}
