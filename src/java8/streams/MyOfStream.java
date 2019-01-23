package java8.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class MyOfStream {
	//Using the 'Of' method we can created stream of hardcoded values.
	public static void main(String[] args) {
		Stream.of("This", "is", "Java8", "Stream").forEach(System.out::println);
		//Creating stream of arrays
		String[] stringArray = new String[]{"Streams", "can", "be", "created", "from", "arrays"};
		Arrays.stream(stringArray).forEach(System.out::println);
		
		
		//Creating BufferedReader for a file
		BufferedReader reader = null;
		try {
			reader = Files.newBufferedReader(Paths.get("File.txt"),StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//BufferedReader's lines methods returns a stream of all lines
		reader.lines().forEach(System.out::println);
		
		
	}
}
