package coreJava.Collections;
/**
 * @author naveen.singh
 *
 * 
 */
public class MyHashMapIterate {

	public static void main(String[] args) {
		java.util.Map<String,Integer> map=new java.util.HashMap<>();
		map.put("Neo",1);
		map.put("Rahul",2);
		System.out.println(map);
		
		for(String key:map.keySet()){
			System.out.println(key+" "+map.get(key));
		}
		
		for(java.util.Map.Entry<String,Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		java.util.Iterator<java.util.Map.Entry<String,Integer>> it=map.entrySet().iterator();
		while(it.hasNext()){
			java.util.Map.Entry<String,Integer> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		map.forEach((K,V)->System.out.println(K+V));
	}

}
