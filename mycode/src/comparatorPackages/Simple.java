package comparatorPackages;

import java.util.*;  
import java.io.*;  
class Simple{  
public static void main(String args[]){  
  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21));  
  
System.out.println("Sorting by Name");  
  
Collections.sort(al,new NameComparator());  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("Sorting by age");  
  
Collections.sort(al,new AgeComparator());  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  



/*
 * Output
 *  Sorting by age 105 Jai 21 101 Vijay 23 106 Ajay 27
 */


/*
 * Java Comparator interface is used to order the objects of a user-defined
 * class.
 * 
 * This interface is found in java.util package and contains 2 methods
 * compare(Object obj1,Object obj2) and equals(Object element).
 * 
 * It provides multiple sorting sequences, i.e., you can sort the elements on
 * the basis of any data member,
 * 
 * 
 * Methods of Java Comparator Interface 
 * Method = Description 
 * public int compare(Object obj1, Object obj2) =It compares the first object with the
 * second object.
 * public boolean equals(Object obj) =It is used to compare the current object with the specified object.
 * public boolean equals(Object obj)=It is used to compare the current object with the specified object.
 * 
 * Collections class provides static methods for sorting the elements of a
 * collection. If collection elements are of Set or Map, we can use TreeSet or
 * TreeMap. However, we cannot sort the elements of List. Collections class
 * provides methods for sorting the elements of List type elements also.
 * 
 */
