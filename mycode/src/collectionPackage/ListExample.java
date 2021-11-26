package collectionPackage;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static int arraData[]= {0,1,3,6,7,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mylist=new ArrayList<Integer>();
		for(Integer x : arraData) {
			System.out.println("Given array "+ x);
		}		
	}
}

//output
//Given array 3
//Given array 6
//Given array 7
//Given array 6

//list contain duplicate values
//maintain insertion order
//random accsess
