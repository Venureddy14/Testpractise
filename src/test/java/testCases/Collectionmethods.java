package testCases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Collectionmethods {
	@Test
	public void arraylist() {
		// ArrayList String
		ArrayList<String> al = new ArrayList<String>();
		al.add("venu");
		al.add("rahul");
		al.add("maveric");
		System.out.println("ArrayList al is " + al);
		System.out.println("size of arraylist al is " + al.size());

		// ArrayList Integer 1
		ArrayList<Integer> ali = new ArrayList<Integer>();
		ali.add(3181);
		ali.add(3012);
		System.out.println("ArrayList Integer ali is " + ali);
		System.out.println("size of arraylist ali is " + ali.size());

		// ArrayList integer 2
		ArrayList<Integer> ali2 = new ArrayList<Integer>();
		ali2.add(6887);
		System.out.println("ArrayList ali2 is " + ali2);

		// addAll method
		boolean b = ali.addAll(ali2);
		System.out.println("Status of Arraylist added is " + b);
		System.out.println("After adding ali2 to ali " + ali);

		// remove method
		ali.remove(1);
		System.out.println("After removing the value in index 1 of ali " + ali);

		boolean b1 = ali.removeAll(ali2);
		System.out.println("Status of Arraylist removed is " + b1);
		System.out.println("After using removeAll method on ali is " + ali);

		System.out.println("After using contains method " + al.contains("venu"));

		Iterator<String> str = al.iterator();
		while (str.hasNext()) {
			System.out.println(str.next());
		}

		LinkedList<Integer> linklist = new LinkedList<Integer>();

		linklist.add(20);
		linklist.add(30);
		linklist.add(20);
		linklist.add(10);
		System.out.println(linklist);

	//Hashset method implementation
		
		TreeSet<Integer> hashint=new TreeSet<Integer>();
		hashint.add(1);
		hashint.add(5);
		hashint.add(30);
		hashint.add(05);
		hashint.add(10);
		hashint.add(50);
		
		System.out.println(hashint);
		
		//HashMap method implementation
		
		HashMap<Integer,String> hash=new HashMap<Integer,String>();
		hash.put(null, "maveric");
		hash.put(1, null);
		System.out.println(hash);
		
		TreeMap<Integer,String> hashtree=new TreeMap<Integer,String>();
		hashtree.put(0, "maveric");
		hashtree.put(null, null);
		hashtree.put(2, "maveric");
		System.out.println(hashtree);
		
		LinkedHashMap<Integer,Integer> hashlink=new LinkedHashMap<Integer,Integer>();
		hashlink.put(0, 1);
		hashlink.put(null, null);
		hashlink.put(1, 2);
		System.out.println(hashlink);
	}
}
