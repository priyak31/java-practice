package staticpackage;

public class staticClass {
	
	public static int count=0;
	staticClass(){
		count++;
		System.out.println("count is" + count);
		
	}

	public static void main(String[] args) {
		
		staticClass sc = new staticClass();
		staticClass sc1 = new staticClass();
		staticClass sc2 = new staticClass();

	}

}


//output
//count is1
//count is2
//count is3

// Static mainly used for memory management means it is constant variable or method that is same for every instance of class.
// it is not access by instance of class.
//It saves memory.
//e.g college name,company name for employee etc
//static method used for accessing static variable.
//static method can't access non-static variable inside it.

