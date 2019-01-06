package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface R{
	boolean show(List<Integer> a);
}
@FunctionalInterface
interface RR extends R{
	boolean show(List s);
}


public class TestFunctional {

	
	public static void main(String[] args) {
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(1,"A"));
		list.add(new Emp(3,"C"));
		list.add(new Emp(2,"D"));
		
		
		
		
/*		
 * 		
 * 		R r=()->System.out.println("kdnsdnsk");
		r.show();
		
		
		
*//*
*
*	predicate as it is taking one input and returning boolean
		R r=(int i)->{
			if(i>0)
			return true;
			else 
				return false;
		};
		
		System.out.println(r.show(1));
		*/
		
		
		
		
		
		
		
		//		functional interface
//		Comparator<Emp> em=(Emp emp1,Emp emp2)->
//			{
//				if(emp1.getId()>emp2.getId()){
//				 return 1;
//				}else if(emp1.getId()<emp2.getId()){
//					 return -1;
//				 }else{
//					 return 0;
//				 }
//			};
			//list.sort(em);
			Collections.sort(list,(Emp emp1,Emp emp2)->{
				if(emp1.getId()>emp2.getId()){
				 return 1;
				}else if(emp1.getId()<emp2.getId()){
					 return -1;
				 }else{
					 return 0;
				 }
			});
		}
}

class Emp {
	private int id;
	private String name;
	

	public Emp(int id, String name) {
		super();
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
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}