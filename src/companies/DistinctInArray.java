package companies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author naveen.singh
 *
 * 
 */
public class DistinctInArray {
	public static void main(String[] args) {
		Integer[] arr={2,4,1,45,6,3,5,6,23,4,5,6,12,77};
		Set<Integer> set=new HashSet<>();
		set.addAll(new ArrayList<Integer>(Arrays.asList(arr)));
		System.out.println(set);
		
		
		
	}
}
