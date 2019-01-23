package coreJava.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyArrayList {
	public static void main(String[] args) {
		String[] geeks = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

		// Conversion of array to ArrayList
		// using Arrays.asList will always give fixed size arrayList
		List<String> al = Arrays.asList(geeks);
		System.out.println(al);

		// Adding some more values to the List will throw
		// java.lang.UnsupportedOperationException so it is always recommended to create new ArrayList
		//al.add("Shashank");
		
		//any element added in below will not throw UnsupportedOperationException
		List<String> alnew = new ArrayList<String>(Arrays.asList(geeks));
		alnew.add("Neo");
		
		
		//====================
		
		int[] arrN = { 1, 2, 3, 4, 5 };

		List<int[]> listN = Arrays.asList(arrN);//but List<Integer> listN = Arrays.asList(arrN); will not work 
		System.out.println(listN);
		
		//======================in Java 8====================
		
		int[] arr = { 1, 2, 3, 4, 5 };

		List<Integer> list = Arrays.stream(arr)		// IntStream
									.boxed()  		// Stream<Integer>
									.collect(Collectors.toList());
		System.out.println(list);
		
		
		
		
		

	}
}
