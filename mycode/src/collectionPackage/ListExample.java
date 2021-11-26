package collectionPackage;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static int arraData[]= {0,4,3,6,7,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>mylist=new ArrayList<Integer>();
		for(Integer x : arraData) {
			System.out.println("Given array "+ x);
		}		
	}
}
