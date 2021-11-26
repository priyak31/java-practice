package collectionPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	 // Main driver method
    public static void main(String[] args)
    {
        // Creating a Set object and declaring it of String
        // type
        // with reference to TreeSet
        Set<String> ts = new TreeSet<String>();
 
        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");
 
        // Adding the duplicate
        // element
        ts.add("India");
 
        // Displaying the TreeSet
        System.out.println(ts);
 
        // Removing items from TreeSet
        // using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                           + "Australia:" + ts);
 
        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();
 
        while (i.hasNext())
            System.out.println(i.next());
    }
}
 //output
	/*
	 * Set after removing Australia:[India, South Africa] Iterating over set:
	 *  India
	 * South Africa
	 */
	/*
	 * it stores elements in a sorted format. TreeSet uses a tree data structure for
	 * storage. Objects are stored in sorted, ascending order. But we can iterate in
	 * descending order using the method TreeSet. descendingIterator().
	 */
