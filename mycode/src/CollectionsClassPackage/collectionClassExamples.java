package CollectionsClassPackage;
import java.util.*;  
public class collectionClassExamples {
	    public static void main(String a[]){      
	        List<String> list = new ArrayList<String>();  
	        list.add("C");  
	        list.add("Core Java");  
	        list.add("Advance Java");  
	        System.out.println("Initial collection value:"+list);  
	        Collections.addAll(list, "Servlet","JSP");  
	        System.out.println("After adding elements collection value:"+list);  
	        String[] strArr = {"C#", ".Net"};  
	        Collections.addAll(list, strArr);  
	        System.out.println("After adding array collection value:"+list);  
	      
	}  
}

//output
/*
 * Initial collection value:[C, Core Java, Advance Java] After adding elements
 * collection value:[C, Core Java, Advance Java, Servlet, JSP] After adding
 * array collection value:[C, Core Java, Advance Java, Servlet, JSP, C#, .Net]
 */

/*
 * Java collection class is used exclusively with static methods that operate on
 * or return collections. It inherits Object class.
 */

/*
 * Java Collection class supports the polymorphic algorithms that operate on
 * collections. Java Collection class throws a NullPointerException if the
 * collections or class objects provided to them are null.
 * 
 */