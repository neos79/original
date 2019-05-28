package companies;

/**
 * @author naveen.singh
 *
 * 
 */
public class ACIFizzBuzz {
	public static void main(String[] args) {
		System.out.println(getReplacedSentence("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16"));
	}

	public static String getReplacedSentence(String sentence) {
		String[] ar = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			if (((i+1) % 3 == 0) && ((i+1) % 5 == 0)) {
				ar[i] = "fuzzbuzz";
			} else if ((i+1) % 3 == 0) {
				ar[i] = "fuzz";
			} else if ((i+1) % 5 == 0) {
				ar[i] = "buzz";
			}
			sb.append(ar[i] + " ");
		}
		return sb.toString().trim();
	}
}
//soap benefit
//https secure how it works
