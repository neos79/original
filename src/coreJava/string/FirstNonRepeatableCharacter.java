package coreJava.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeatableCharacter {

	public static void main(String[] args) {
		
		//first non repeatable character in string
		String str="aeabbccd";
		Set<Character> linkedHashSet=new LinkedHashSet<>();
				for(int i=0;i<str.length();i++){
						if(!linkedHashSet.contains(str.charAt(i))){
							linkedHashSet.add(str.charAt(i));
							continue;
						}
						if(linkedHashSet.contains(str.charAt(i))){
							linkedHashSet.remove(str.charAt(i));
							continue;
						}
					}	
			}

}
