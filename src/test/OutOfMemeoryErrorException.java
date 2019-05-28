package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author naveen.singh
 *
 * 
 */
public class OutOfMemeoryErrorException {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		Random random = new Random();
		int i=0;
		while (true){
			System.out.println(i);
			list.add(random.nextInt());
			i++;
		}

	}

}
