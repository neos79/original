package designPattern.singleton;

public class EagerSingleton {

		final static EagerSingleton eagerSingleton=new EagerSingleton(); 
		
		public static EagerSingleton getEagerSingleton(){
			return eagerSingleton;
		}
		
		public static void main(String[] args) {
			System.out.println(eagerSingleton);
			System.out.println(eagerSingleton);
			System.out.println(eagerSingleton);
			
			System.out.println(EagerSingleton.eagerSingleton);
			System.out.println(EagerSingleton.getEagerSingleton());
		}
		
}
