package coreJava.serialization;

import java.io.Serializable;

public class MySerialization{
	public static void main(String a[]){
		serialize(new Emp(1,"Neo"));
		deserialize();
	}
	public static void serialize(Emp emp){
		try(java.io.FileOutputStream fileOutputStream=new java.io.FileOutputStream("D:\\SerializedEmp");
			java.io.ObjectOutputStream objectOutputStream=new java.io.ObjectOutputStream(fileOutputStream);){
			objectOutputStream.writeObject(emp);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void deserialize(){
		try(java.io.FileInputStream fileInputStream=new java.io.FileInputStream("D:\\SerializedEmp");
			java.io.ObjectInputStream objectInputStream=new java.io.ObjectInputStream(fileInputStream);){
				Emp emp=(Emp)objectInputStream.readObject();
				System.out.println(emp.getId()+"-"+emp.getName());
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
class Emp implements Serializable{
	private int id;
	private String name;
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
}