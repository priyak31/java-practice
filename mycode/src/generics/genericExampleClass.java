package generics;

public class genericExampleClass<T> {
	
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		genericExampleClass<Integer> ex=new genericExampleClass<Integer>();
		genericExampleClass<String> ex1=new genericExampleClass<String>();
		
		ex.add(10);
		ex1.add("hello world");
		
		System.out.println("Integer"+" "+ex.get()+" String"+" "+ex1.get());

	}

}


//output
//Integer 10 String hello world
