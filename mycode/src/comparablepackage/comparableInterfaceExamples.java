package comparablepackage;

public class comparableInterfaceExamples implements Comparable<comparableInterfaceExamples>{
	
	int rollno;  
	String name;  
	int age;  
	comparableInterfaceExamples(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	  
	public int compareTo(comparableInterfaceExamples st){  
	if(age==st.age)  
	return 0;  
	else if(age>st.age)  
	return 1;  
	else  
	return -1;  
	}  

}
