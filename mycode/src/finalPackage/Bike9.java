package finalPackage;

/*There is a final variable speedlimit, 
 * we are going to change the value of this variable,
 *  but It can't be changed because final variable once 
 *  assigned a value can never be changed.
*/


public class Bike9 {
	final int speedlimit=90;//final variable  
	 void run(){  
	  //speedlimit=400;  
	 }  
	 public static void main(String args[]){  
	 Bike9 obj=new  Bike9();  
	 obj.run();  
	 }  
}

/*
 * output Output:Compile Time Error
 */
