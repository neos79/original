package companies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author naveen.singh
 *
 * 
 */


public class Cognizant{
	public static void main(String ar[]){
		List<Developer> list=new ArrayList<>();
		
		List<String> skillSet1=new ArrayList<>();
		skillSet1.add("JAVA");
		skillSet1.add("SPRING");
		skillSet1.add("C24");
		
		List<String> skillSet2=new ArrayList<>();
		skillSet2.add("DB");
		skillSet2.add("JBPM");
		skillSet2.add("DROOLS");
		
		List<String> skillSet3=new ArrayList<>();
		skillSet3.add("JAVA");
		skillSet3.add("JBPM");
		skillSet3.add("HUBS");
		
		list.add(new Developer(3,"A",skillSet1));
		list.add(new Developer(2,"B",skillSet2));
		list.add(new Developer(1,"C",skillSet3));
		
		System.out.println(getName(list,"JAVA"));
		
	
	}
	
	public static String getName(List<Developer> developers, String skillName){
		List<Developer> list=new ArrayList<>();
		
		Comparator<Developer> c= 	new Comparator<Developer>(){
			public int compare(Developer d1, Developer d2)
			{
			if(d1.getId()<d2.getId()){
				return -1;
			}else if(d1.getId()>d2.getId()){
				return 1;
			}else{
				return 0;
			}
		}
	};
		
		/*list=developers.stream().filter(d->d.getSkillSet().contains(skillName)).
		sorted(c).collect(Collectors.toList());*/
	
	      list=developers.stream().filter(d->d.getSkillSet().contains(skillName)).
			sorted(c).collect(Collectors.toList());
	
		System.out.println(list);
		return null;
	}
}
/*
 * /*(d1,d2)->d1.getId()>d2.getId()?1:d1.getId()<d2.getId()?-1:0*/
class DeveloperComparator implements Comparator<Developer>{
	public int compare(Developer d1,Developer d2){
		if(d1.getId()<d2.getId()){
			return -1;
		}else if(d1.getId()>d2.getId()){
			return 1;
		}else{
			return 0;
		}
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



	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", skillSet=" + skillSet + "]";
	}
	
}
