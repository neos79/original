package java8.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class MyInstream {

	public static void main(String[] args) throws IOException {
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
		Arrays.stream(new int[]{2,4})
			.map(x->x*x)
			.average().ifPresent(System.out::print);
		
		
		System.out.println("\n\n-----Stream from List, filter print----------");
		List<String> people=Arrays.asList("Ab","Ra","mn","DK","RS");
			people.stream().map(String::toUpperCase)
			.filter(x->x.startsWith("R")).sorted()
			.forEach(System.out::printf);
			
			
		IntStream.rangeClosed(1, 10).forEach(num -> System.out.print(num)); // ->12345678910

		IntStream.range(1, 10).forEach(num -> System.out.print(num)); // ->123456789
			
			
		System.out.println("\n\n-----Stream row from text file sort filter print----------");	
			Stream<String> bands=Files.lines(Paths.get("Band.txt"));
				bands.sorted().filter(x->x.length()>10)
				.forEach(System.out::printf);
			bands.close();
	}

}

class Developer{
	private int id;
	private String name;
	private List<String> skillSet;
	
	
	public Developer(int id, String name, List<String> skillSet) {
		super();
		this.id = id;
		this.name = name;
		this.skillSet = skillSet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}
	
	
	
}

