package coreJava.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyString {
	public static void main(String[] args) {
		// Holiday validation ,resolve payment product, calucalute release,
		// calculate, working hour, date cut off
		// calculate payment arrival date

		String s1 = new String("pankaj");
		String s2 = new String("PANKAJ");
		System.out.println(s1 = s2);
		
		 String s3="you cannot change me";
		 String s4=new String("you cannot change me");
		 System.out.println(s3==s4);
		 String s5=new String("you cannot change me");
		 System.out.println(s4==s5);
		 String s6="you cannot"+" change me";//will be concatinated at compile time
		 System.out.println("s3==s6"+(s3==s6));
		 String s7="you cannot";
		 String s8=s7+" change me";//bcz of one variable will be done 
		 //at run time so object will created at compile time and thus on heap area
		 System.out.println(s3==s8);
		 
		 final String s9="you cannot";
		 String s10=s9+" change me";//because of s9 being final it will be substituted at compile time
		 System.out.println(s3==s10);//important
		 
		 
		 String s11=new String("Neo");
		 String s12=s11.intern();//will get heap reference
		 String s13="Neo";
		 System.out.println("s12==s13"+(s12==s13));

		// print duplicate Character from string
		//duplicateCharacterInString("Naveenv".toLowerCase());

		// find maximum occurring character in string
		
		//String no of times
		//System.out.println(stringNumberOfTimes("Rahul",5));

	}

	private static String stringNumberOfTimes(String s,int times) {
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<times;i++) {
			sb.append(s);
		}
		return sb.toString();
	}

	public static void duplicateCharacterInString(String s3) {
		char[] chars = s3.toCharArray();
		Set<Character> set = new HashSet<>();
		for (char c : chars) {
			if (set.contains(c)) {
				System.out.println(c);
			} else {
				set.add(c);
			};

		}
	}
	
	public static void maximumOccuringCharacter(String s){
		Map<Character,Integer> map=new HashMap<>();
		for (Character c : s.toCharArray()) {
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
	} 

}
