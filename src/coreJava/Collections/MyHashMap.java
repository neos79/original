package coreJava.Collections;

import java.util.HashSet;
import java.util.Set;

/**
 * @author naveen.singh
 */
public class MyHashMap {
	public static void main(String[] args) {
		Set<Employee> hashSet=new HashSet<>();
		hashSet.add(new Employee(1,"Rahul"));
		hashSet.add(new Employee(1,"Rahul"));
		
		System.out.println(hashSet.size());
	}
}
class Employee{
	private int id;
	private String name;
	
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
