package coreJava.arrayList;

import java.util.Arrays;
import java.util.List;

public class MyArrayList {
	public static void main(String[] args) {
		String[] geeks = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

		// Conversion of array to ArrayList
		// using Arrays.asList will always give fixed size arrayList
		List<String> al = Arrays.asList(geeks);
		System.out.println(al);

		// Adding some more values to the List will throw
		// java.lang.UnsupportedOperationException
		al.add("Shashank");
		al.add("Nishant");

	}
}
