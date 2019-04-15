package coreJava.arrays;

public class ArraysToString {
	public static void main(String[] args) {
		int [] intarray=new int[]{1,3,2,5,6,4,7,8,6,9};
		//System.out.println(arrayToString((Object)intarray,",");
		
	}
	public static String arrayToString(Object[] a, String separator) {
		StringBuilder result = new StringBuilder();
		if (a.length > 0) {
			result.append(a[0]);
			for (int i = 1; i < a.length; i++) {
				result.append(separator);
				result.append(a[i]);
			}
		}
		return result.toString();
	}
}
