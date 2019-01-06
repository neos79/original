package online.hR;

import java.util.Arrays;

public class MyAnargram {

	public static void main(String[] args) {
		String a="rCAT".toUpperCase();
		String b="TaCR".toUpperCase();
		
		char[] aChar=a.toCharArray();
		char[] bChar=b.toCharArray();
		
		Arrays.sort(aChar);
		Arrays.sort(bChar);
		System.out.println(isAnagram(a,b));
		
	}
	static boolean isAnagram(String a, String b) {
        char[] aChar=a.toCharArray();
        char[] bChar=b.toCharArray();
        
        Arrays.sort(aChar);
        Arrays.sort(bChar);

        
        if(aChar.length!=bChar.length){
            return false;
        }else{
            for(int i=0;i<aChar.length;i++){
                if(aChar[i]!=bChar[i])
                    return false;
            }
            return true;
        }
    
    }
}
