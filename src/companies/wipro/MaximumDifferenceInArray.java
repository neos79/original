package companies.wipro;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author naveen.singh
 *
 * 
 */
public class MaximumDifferenceInArray {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int arrLength=sc.nextInt();
	int[] arr=new int[arrLength];
	int max = 0,min = 0;
	
	for(int i=0;i<arrLength;i++){
		arr[i]=sc.nextInt();
		if(max<=arr[i]){
			max=arr[i];
		}
		if(min==0||min>=arr[i]){
			min=arr[i];
		}
			
		}
	System.out.println(Arrays.toString(arr));
	System.out.println("max :"+max);
	System.out.println("min :"+min);
	System.out.println(Math.abs(max-min));
	sc.close();
}
}
