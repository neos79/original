package companies;
/**
 * @author naveen.singh
 *
 * 
 */
public class Apptify {
 public static void main(String[] args) {
	
}
 public static long pow(long base,long power)
	{
		System.out.print(" pow("+base+","+power+") : ");
		long powReturn = 0;
		if(power == 0)
		{
			powReturn =	base; 
		}else
		{ 
			long tempPow = pow(base,power/2);
			if(power%2 == 0)
			{
				powReturn =	tempPow*tempPow;
			}else
			{
				powReturn =	base*tempPow*tempPow;
			}
		}
		System.out.println(powReturn);
		return powReturn;
	}
}
