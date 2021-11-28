package abstraction;

abstract class Bike{  
	  abstract void run();  
	}  
	class Honda4 extends Bike{  
	void run(){System.out.println("running safely");}  
	public static void main(String args[]){  
	 Bike obj = new Honda4();  
	 obj.run();  
	}  
	}  
	
	
	/*
	 * Points to Remember An abstract class must be declared with an abstract
	 * keyword. It can have abstract and non-abstract methods. It cannot be
	 * instantiated. It can have constructors and static methods also. It can have
	 * final methods which will force the subclass not to change the body of the
	 * method.
	 */
	
	/*
	 * output running safely
	 */