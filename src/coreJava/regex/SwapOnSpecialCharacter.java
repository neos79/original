package coreJava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SwapOnSpecialCharacter {

	public static void main(String[] args) {
		String input="ADFdg,h@A";
		System.out.println("Input :"+input);
		System.out.println("Output:"+specialCharacter(input));
	}

	public static String specialCharacter(String s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (i == j)
				break;
			Pattern p = Pattern.compile("[!@#$%^&*(),.?:{}|]");
			Matcher front = p.matcher(String.valueOf(s.charAt(i)));
			Matcher back = p.matcher(String.valueOf(s.charAt(j)));
			if (front.find() || back.find()) {
				char[] c = s.toCharArray();
				char temp = s.charAt(i);
				c[i] = s.charAt(j);
				c[j] = temp;
				s = String.copyValueOf(c);
				//System.out.println(s);
			}
		}
		return s;
	}
}