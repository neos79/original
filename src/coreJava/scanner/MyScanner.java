package coreJava.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<Stu> list = new ArrayList<Stu>();
		int i=0;
		while (i<6&&input.hasNext()) {
			int id=input.nextInt();
			String name=input.next();
			int mark=input.nextInt();
			if(name.equals("#"))
				break;
			list.add(new Stu(id,name,mark));
			
			i++;
			
		
		}
		input.close();
		list.forEach(item->System.out.println(item));

	}

}

class Stu {
	private int id;
	private String name;
	private int marks;

	public int getId() {
		return id;
	}

	public Stu(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}
