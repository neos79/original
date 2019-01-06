package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MyHcf {

	public static void main(String[] args) {
		
		System.out.println(factors(15));
		
	}
	public static  List<Integer> factors(int num){
		List<Integer> listOfFactors=new ArrayList<Integer>();
		for(int i=1;i<((num/2)+1);i++){
			if(num%i==0){
				listOfFactors.add(i);
			}
		}
		
		return listOfFactors;
		
	}
}
