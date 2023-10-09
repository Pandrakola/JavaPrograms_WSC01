package treeSet;

import java.util.Set;
import java.util.TreeMap;

public class TreeMappConcept {

	public static void main(String[] args) {
     TreeMap tm=new TreeMap();
     
     tm.put(1000, "Anitha");
     tm.put(8000, "Ramesh");
     tm.put(10000, "Tressa");
     tm.put(4000, "Tijo");
     tm.put(6000, "family");
     
     System.out.println(tm);
     System.out.println(tm.keySet());
     System.out.println(tm.values());
     System.out.println(tm.get(6000));
     
     System.out.println(tm.lastKey());
     
     System.out.println(tm.firstKey());
     
     Set<Integer>KeyLessThan8 = tm.headMap(8000).keySet();
     System.out.println(KeyLessThan8);
     
     Set<Integer>KeyLessThan6= tm.tailMap(4000).keySet();
     System.out.println(KeyLessThan6);
     
	}

}
