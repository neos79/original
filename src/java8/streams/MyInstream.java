package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.TooManyListenersException;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class MyInstream {

	public static void main(String[] args) {
		System.out.println("printing 1-9");
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println("\n---------------");
		
		System.out.println("\nskip upto 6");
		IntStream.range(1, 10).skip(6).forEach(System.out::print);
		System.out.println("\n---------------");
		
		System.out.println("\nskip upto  4");
		IntStream.range(1, 10).skip(4).forEach(x->System.out.print(x+"\t"));
		System.out.println("\n---------------");
		
		System.out.print("\nsum :");
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println("---------------");
		
		Stream.of("Rahul","Ava","Aneri","Alberto").sorted().findFirst().ifPresent(System.out::println);
		
		System.out.println("\n------start with s and sorteed---------");
		String[] names={"Al","Ankit","Kaushal","Brent","Sarika","amanda","Hans","Shivika","Rahul"};
		Arrays.stream(names) //same as Streams.Of(name)
			.filter(x->x.startsWith("S"))
			.sorted()
			.forEach(System.out::printf);
		
		
		System.out.println("\n\n---filter map collector------------");
		List<Integer> numbers=Arrays.asList(11,1,2,3,4,5,6,7,8,9,10);
		List<Integer> result=numbers.stream().filter(e->e%2==0).map(e->e*2).collect(Collectors.toList());
		
		result.stream().forEach(x->System.out.print(x+"\t"));
		
		
		System.out.println("\n\n-----average of squares----------");
		Arrays.stream(new int[]{2,4,6,8,10})
			.map(x->x*x)
			.average().ifPresent(System.out::print);
		
		
		
		
	}

}
