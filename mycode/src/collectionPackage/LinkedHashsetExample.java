package collectionPackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample {
	
	 public static void main(String[] args)
	    {
	        Set<String> lh = new LinkedHashSet<String>();
	 
	        // Adding elements into the LinkedHashSet
	        // using add()
	        lh.add("India");
	        lh.add("Australianew");
	        lh.add("South Africanew");
	 
	        // Adding the duplicate
	        // element
	        lh.add("India");
	 
	        // Displaying the LinkedHashSet
	        System.out.println(lh);
	 
	        // Removing items from LinkedHashSet
	        // using remove()
	        lh.remove("Australia");
	        System.out.println("Set after removing "
	                           + "Australia:" + lh);
	 
	        // Iterating over linked hash set items
	        System.out.println("Iterating over set:");
	        Iterator<String> i = lh.iterator();
	        while (i.hasNext())
	            System.out.println(i.next());
	    }
	}

	/*
	 * output 
	 * Iterating over set: India Australianew South Africanew
	 * 
	 */

	/*
	 * it is an ordered version of HashSet that maintains a doubly-linked List -When
	 * the iteration order is needed to be maintained this class is used. When
	 * iterating through a HashSet the order is unpredictable, while a LinkedHashSet
	 * lets us iterate through the elements in the order in which they were
	 * inserted.
	 * 
	 */
