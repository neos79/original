package companies;

/**
 * @author naveen.singh
 *
 * 
 */
public class ParentChildVariable {
	public static void main(String args[]) {
       App myApp = new App(10);
       System.out.println(myApp.index);
		
    }
}
class Super {
    public int index = 1;
}

class App extends Super {
	public int index=5;

    public App(int pindex) {
    	System.out.println(index);
        this.index = pindex;
        System.out.println(super.index);
        System.out.println(index);
        
    }

    
}
