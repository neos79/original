package coreJava.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListToArrays {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Object[] objects = al.toArray();

		// Printing array of objects
		for (Object obj : objects)
			System.out.print(obj + " ");

		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);

		// cannot be converted to Integer[]
		// Integer[] objects1 = al.toArray();// Error: incompatible types:
		// Object[]

		//=======================
				
				List<Integer> alR = new ArrayList<Integer>(); 
        alR.add(10); 
        alR.add(20); 
        alR.add(30); 
        alR.add(40); 
  
        Integer[] arr = new Integer[al.size()]; 
        arr = al.toArray(arr); 
		
	}

}
