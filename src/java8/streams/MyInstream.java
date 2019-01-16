package java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyInstream {

	public static void main(String[] args) {
		System.out.println("printing 1-9");
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println("\nskip upto 6");
		IntStream.range(1, 10).skip(6).forEach(System.out::print);
		System.out.println("\nskip upto  4");
		IntStream.range(1, 10).skip(4).forEach(x->System.out.print(x+"\t"));
		System.out.print("\nsum :");
		System.out.println(IntStream.range(1, 5).sum());
		
		System.out.println("---------------");
		Stream.of("Ava","Aneri","Alberto").sorted().findFirst().ifPresent(System.out::println);
		
		String[] names={"Al","Ankit","Kaushal","Brent","Sarika","amanda","Hans","Shivika","Rahul"};
		Arrays.stream(names) //same as Streams.Of(name)
			.filter(x->x.startsWith("S"))
			.sorted()
			.forEach(System.out::printf);
	}

}
