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
