package dataStructure;

import java.util.Set;
import java.util.TreeSet;

public class MyTreesSet {
	public static void main(String[] args) {

		Set<Object> set = new TreeSet<>();
		set.add(new String("rahul"));//1
		set.add(new String("rahul"));//2 //will not be added to treeSet as both 1 and 2 are same 
		set.add(new String("rahu1"));//can be added to treeSet as they are different
	//set.add(new StringBuffer("rahul"));// cannot be added to treeSet as type of String and StringBuffer is not same
	//set.add(new StringBuilder("rahul"));// cannot be added to treeSet as type of String and StringBuffer is not same		
	//both of the above will throw class cast exception.
		System.out.println(set);
		System.out.println(set.size());
	}
}