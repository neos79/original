package companies;

import java.util.Arrays;

/**
 * @author naveen.singh
 *
 * 
 */
public class ACIBigestSentence {
	public static void main(String[] args) {
		String[] str="My  & name is?    ? .Your name is neo singh!he is ra.!".split("[?.!]");
		int index=0;
		int max=0;
		System.out.println(Arrays.toString(str));
			for(int i=0;i<str.length;i++){
				if(str[i].length()>max){
					index=i;
					max=str[i].length();
				}
			}
		String [] wordCount=str[index].split(" +");
		System.out.println(wordCount.length);
	}
}
