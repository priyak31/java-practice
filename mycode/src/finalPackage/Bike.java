package finalPackage;
	//final
   class Bike{  
		  final void run(){System.out.println("running");}  
		}  
		     
		class Honda extends Bike{  
			/*
			 * void run(){ System.out.println("running safely with 100kmph"); }
			 */ 
		     
		   public static void main(String args[]){  
		   Honda honda= new Honda();  
		   honda.run();  
		   }  
		}  

		/* If you make any method as final, you cannot override it. */
		/* final method is inherited but you cannot override it. For Example: */
		/*
		 * If you make any class as final, you cannot extend it.
		 */
		/*
		 * output Compile Time Error
		 */