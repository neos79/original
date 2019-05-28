package companies;

import java.io.File;

/**
 * @author naveen.singh
 *
 * 
 */
public class FloatIncrement {
	public static void main(String args[]) {
		int bits;

        bits = -3 >> 1;
        System.out.println(bits);
        bits = bits >>> 2;
        System.out.println(bits);
        bits = bits << 1;
        System.out.println(bits);
        
        File sys = new File("/java/system");
        System.out.print(sys.canWrite());
        System.out.print(" " + sys.canRead());
        
        byte x = -2; 
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(x>>1));    
        int y = 4; 
        System.out.println(y>>1);
	}
}	
