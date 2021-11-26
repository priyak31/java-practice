package comparablepackage;

import java.util.ArrayList;
import java.util.Collections;

public class sortEx {
	
	public static void main(String args[]){  
		ArrayList<comparableInterfaceExamples> al=new ArrayList<comparableInterfaceExamples>();  
		al.add(new comparableInterfaceExamples(101,"Vijay",23));  
		al.add(new comparableInterfaceExamples(106,"Ajay",27));  
		al.add(new comparableInterfaceExamples(105,"Jai",21));  
		  
		Collections.sort(al);  
		for(comparableInterfaceExamples st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		}  

}

/*
 * output 105 Jai 21 101 Vijay 23 106 Ajay 27
 */


/*
 * Java Comparable interface is used to order the objects of the user-defined
 * class. This interface is found in java.lang package contains only one method
 * named compareTo(Object). It provides a single sorting sequence only, i.e.,
 * you can sort the elements on the basis of single data member only.
 * compareTo(Object obj) method public int compareTo(Object obj): It is used to
 * compare the current object with the specified object. It returns
 * 
 * positive integer, if the current object is greater than the specified object.
 * negative integer, if the current object is less than the specified object.
 * zero, if the current object is equal to the specified object.
 */
