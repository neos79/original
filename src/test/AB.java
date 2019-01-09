package test;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class AB {
	public static void main(String[] args) {
		String s="A";
		switch(s){
		case "a":
			System.out.println("a");
		default :
			System.out.println("default");
		case "A":
			System.out.println("A");
		case "C":
			System.out.println("C");
		}
		
		
		LocalDate date=LocalDate.of(2015, 03, 27);
		Period p=Period.ofDays(1);
		List list=new ArrayList<>();
		//list.removeIf(e->e%2==0);
		System.out.println(date.plus(p));
		
		
		list.add("coke");
		list.add("per");list.add("dfd");
		String[] a1=new String[list.size()];
		//String[] a2=list.toArray(a1);
		
		
		
	}
}
