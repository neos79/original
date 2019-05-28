package coreJava.list;

import java.util.ArrayList;

public class MyDuplicateInArrayList {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("A");
		arr.add("V");
		arr.add("R");
		System.out.println(arr.contains("V"));
		System.out.println(arr.contains("N"));
		System.out.println(arr.indexOf("R"));
		
	}
}
