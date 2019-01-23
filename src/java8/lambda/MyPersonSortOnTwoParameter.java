package java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyPersonSortOnTwoParameter {

	public static void main(String[] args) {
		Person p1 = new Person("Naveen","Singh", 11);
		Person p2 = new Person("Mayank","Sharma",22);
		Person p3 = new Person("Pawan","Singh", 33);
		Person p4 = new Person("Rahul","Singh", 44);
		Person p5 = new Person("Naveen","Singh", 22);

		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p3);
		persons.add(p4);
		persons.add(p2);
		persons.add(p5);
		/*
		Comparator<Person> comparator = Comparator.comparing(Person::getFirstName).thenComparing(Person::getAge);
		
		Collections.sort(persons, comparator);
		persons.forEach(person -> System.out.println(person.getFirstName() + person.getAge()));

		*/
		
		
		Comparator<Person> sortByFirstName = (p, o) -> p.getFirstName().compareToIgnoreCase(o.getFirstName());
		//Comparator<Person> sortByLastName = (p, o) -> p.getLastName().compareToIgnoreCase(o.getLastName());
		Comparator<Person> sortByAge = (p, o) -> Integer.compare(p.getAge(), o.getAge());
		
		/*persons.stream().sorted(sortByFirstName.thenComparing(sortByAge))
		.forEach(person -> System.out.println(person.getFirstName() + person.getAge()));
		*/
		
		/*persons.stream().sorted(sortByFirstName.thenComparing(sortByLastName).thenComparing(sortByAge).reversed())
				.forEach(person -> System.out.println(person));*/
		
		order(persons);
	}
	
	
	private static void order(List<Person> persons) {

	    Collections.sort(persons, new Comparator() {

	        public int compare(Object o1, Object o2) {

	            String x1 = ((Person) o1).getFirstName();
	            String x2 = ((Person) o2).getLastName();
	            int sComp = x1.compareTo(x2);

	            if (sComp != 0) {
	               return sComp;
	            } 

	            Integer y1 = ((Person) o1).getAge();
	            Integer y2 = ((Person) o2).getAge();
	            return y1.compareTo(2);
	    }});
	    
	    persons.forEach(person -> System.out.println(person.getFirstName() + person.getAge()));
	}
}

class Person {
	private String FirstName;
	private String LastName;
	private int age;
	public Person(String firstName, String lastName, int age) {
		FirstName = firstName;
		LastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (FirstName == null) {
			if (other.FirstName != null)
				return false;
		} else if (!FirstName.equals(other.FirstName))
			return false;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (age != other.age)
			return false;
		return true;
	}
	
	
	
	
}