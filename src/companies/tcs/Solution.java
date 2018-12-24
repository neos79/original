package companies.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MailBoxComparator implements Comparator<MailBox>{

	@Override
	public int compare(MailBox o1, MailBox o2) {
		if(o1.getId()>o2.getId())
			return 1;
		else if(o1.getId()<o2.getId())
			return -1;
		else
			return 0;
	}
	
	
}



public class Solution {
	public MailBox[] customSort(MailBox[] mailBoxes){
		
		int first=mailBoxes[0].getId();
		int second=mailBoxes[1].getId();
		int third=mailBoxes[2].getId();
		
		if(first>second&&second>third){
			mailBoxes[0]=mailBoxes[2];
			mailBoxes[1]=mailBoxes[1];
			mailBoxes[2]=mailBoxes[0];
			return mailBoxes;
		}else if(second>third&&third>first){
			mailBoxes[0]=mailBoxes[0];
			mailBoxes[1]=mailBoxes[2];
			mailBoxes[2]=mailBoxes[1];
			return mailBoxes;
		}else {
			return mailBoxes;
		}
		//return mailBoxes;
		
	}
	
    public static void main(String args[] ) throws Exception {
    	
    	//Scanner input = new Scanner(System.in);
    	
    	MailBox mb1=new MailBox(4,"A","01011991");
    	MailBox mb2=new MailBox(2,"B","01011992");
    	MailBox mb3=new MailBox(7,"C","01011993");
    	
    	MailBox mb4=new MailBox(2,"X","01011997");
    	
    	MailBox[] mailboxes=new MailBox[3];
    	mailboxes[0]=mb1;
    	mailboxes[1]=mb2;
    	mailboxes[2]=mb3;
    	replaceMailBoxById(mailboxes,mb4);
    	List<MailBox> list=new ArrayList<MailBox>(Arrays.asList(mailboxes));
    	//Collections.sort(list,new MailBoxComparator());
    	/*list.addAll(mailboxes);
    	//list.add(e);
    	//list.add(e);
    	*/
    	list.forEach(item->System.out.println(item));
    	System.out.println();
    	System.out.println("");
    	
    	
    }
    public static boolean replaceMailBoxById(MailBox [] mailboxes,MailBox mailbox){
    	
    	for(MailBox mb:mailboxes){
    		if(mb.getId()==mailbox.getId()){
    			mb.setName(mailbox.getName());
    			mb.setCreationDate(mailbox.getCreationDate());
    			return true;
    		}
    		
    	}
		
		return false;
		
	}
    	
    	
/*
    	Scanner input = new Scanner(System.in);
    	Student s0=new Student();
    	Student s1=new Student();
    	Student s2=new Student();
    	Student[] students=new Student[3]; 
    	students[0]=s0;
    	students[1]=s1;
    	students[2]=s2;
    	
    	List list=
    	while(input.hasNext){
    		list.add(new Student(input.nextInt(),input.next(),input.nextInt()));
    	}
    	
    	
    	//for(int i=0;i<9;i++){
    		
    		s0.setId(input.nextInt());	
    		s0.setName(input.next());
    		s0.setMarks(input.nextInt());
    		
    		s1.setId(input.nextInt());
    		s1.setName(input.next());
    		s0.setMarks(input.nextInt());
    		
    		s2.setId(input.nextInt());
    		s2.setName(input.next());
    		s2.setMarks(input.nextInt());
    //	}
*/    	
    
    
    public static Student getStudentWithHighestMarks(Student st1, Student st2, Student st3){
    	int first=st1.getMarks();
    	int second=st1.getMarks();
    	int third=st1.getMarks();
    	
    	
		return st1;
        
    }
}

class Student {
	private int id;
	private String name;
	private int marks;
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
