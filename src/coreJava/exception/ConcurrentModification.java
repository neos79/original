package coreJava.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConcurrentModification {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			System.out.println(it.next()==2);
			if(it.next()==2){
				list.remove(2);
			}
			//System.out.println(it);
		}
	
	/*
	Map<String,String> myMap = new HashMap<String,String>();
    myMap.put("1", "1");
    myMap.put("2", "2");
    myMap.put("3", "3");

    Iterator<String> it1 = myMap.keySet().iterator();
    while(it1.hasNext()){
        String key = it1.next();
        System.out.println("Map Value:"+myMap.get(key));
        if(key.equals("2")){
           // myMap.put("1","4");
            myMap.remove(3);
        }
    }
*/	}
}
