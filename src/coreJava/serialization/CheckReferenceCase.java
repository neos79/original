package coreJava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CheckReferenceCase {
	/*
	 * Points to remember 1. If a parent class has implemented Serializable
	 * interface then child class doesn’t need to implement it but vice-versa is
	 * not true. 2. Only non-static data members are saved via Serialization
	 * process. 3. Static data members and transient data members are not saved
	 * via Serialization process.So, if you don’t want to save value of a
	 * non-static data member then make it transient. 4. Constructor of object
	 * is never called when an object is deserialized. 5. Associated objects
	 * must be implementing Serializable interface.
	 * 
	 */public static void main(String[] args) {
		A a = new A("SSS");
	//	C c = new C("ddd");
		B b = new B();
		b.setName("Neo");
		//a.setB(b);
		//c.setId(1);
		//c.setB(b);

		serialize(a);
		deserialize();
	}

	public static void serialize(A object) {
		
		try (FileOutputStream fileOutputStream= new FileOutputStream("D:\\serializedFile");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);){
			    objectOutputStream.writeObject(object);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void deserialize() {
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream("D:\\serializedFile");
			objectInputStream = new ObjectInputStream(fileInputStream);
			// A a = (A)objectInputStream.readObject();
			C c = (C) objectInputStream.readObject();
			// System.out.println("Printing B Name :"+a.getB().getName());
			System.out.println("PrintIng C id:" + c.getId() + "\nPrinting B Name :" + c.getB().getName());
			fileInputStream.close();
			objectInputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class A {
	
	A(String s){
		this.country=s;
	}
	
	private String country;
	private B b;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}

class B implements Serializable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class C extends A implements Serializable {
	C(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	int id;
	B b;

	public int getId() {
		super.getCountry();
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

}