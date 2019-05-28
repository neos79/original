package coreJava.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author naveen.singh
 *
 * 
 */
public class MyArrayListContains {

	public static void main(String[] args) {
		List<Customer> customerList=new ArrayList<>();
		customerList.add(new Customer(1,"Rahul"));
		customerList.add(new Customer(3,"Neo"));
		customerList.add(new Customer(2,"pawan"));
		customerList.add(new Customer(4,"Naveen"));
		Customer neo=new Customer(5,"dir");
		customerList.add(neo);
		System.out.println(customerList.contains(neo));
		System.out.println(customerList.indexOf(neo));
		
	}

}
class Customer {
	 
    private int id;
    private String name;
	public Customer(int i, String name) {
		this.id=i;
		this.name=name;
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
	
    
}
