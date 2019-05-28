package test;

import java.util.Scanner;

import javax.swing.event.CellEditorListener;

/**
 * @author naveen.singh
 *
 * 
 */
public class T2 {
	public static void main(String args[] ) throws Exception {

	    Scanner sc=new Scanner(System.in);
	    
	    double d;
	    
	    while(sc.hasNextLine()){
	    	int n=sc.nextInt();
		    int p=sc.nextInt();
		    
		    if(n<0&&p<0){
		    	try{
		    		throw new Exception("n and p should not be zero.");
		    	}catch(Exception e){
		    		System.out.println(e.getClass().getName()+": "+e.getMessage()+e.getLocalizedMessage());
		    	}
		    }else if(n<0||p<0){
		        try{
		        	throw new Exception("n and p should be non-negative");
		    	}catch(Exception e){
		    		System.out.println(e.getClass().getName()+": "+e.getMessage());
		    	}
		    }else{
		        System.out.println(Math.round((Math.pow(n, p))));
		    }

	    }
	    sc.close();
	   }
}
