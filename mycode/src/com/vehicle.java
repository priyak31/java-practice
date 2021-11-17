package com;

public class vehicle {
    public static int a=1;
	public vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public static void talk()
    {
          System.out.println("hello there!");
    }
	public static void talk(String name)
    {
		  a=3;
          System.out.println("hello there!" + name + " value" + a);
    }
	public void talkFinal()
    {
		  a=5;
          System.out.println("Final value" + a);
    }

	public static void main(String[] args) {
		
	          talk("Matthew");
	          vehicle obj = new vehicle();
	          obj.talkFinal();
	    
	}

}
