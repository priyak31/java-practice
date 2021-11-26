package collectionPackage;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Queue<Integer> q1 = new LinkedList<Integer>();
		        //Add elements to the Queue
		        q1.add(10);
		        q1.add(20);
		        q1.add(30);
		        q1.add(40);
		        q1.add(50);
		        System.out.println("Elements in Queue:"+q1);
		        //remove () method =>removes first element from the queue
		        System.out.println("Element removed from the queue: "+q1.remove());
		        //element() => returns head of the queue
		        System.out.println("Head of the queue: "+q1.element());
		        //poll () => removes and returns the head
		        System.out.println("Poll():Returned Head of the queue: "+q1.poll());
		        //returns head of the queue
		        System.out.println("peek():Head of the queue: "+q1.peek());
		        //print the contents of the Queue
		        System.out.println("Final Queue:"+q1);
		    }
		}

	

//output
//Head of the queue: 20
//Poll():Returned Head of the queue: 20
//peek():Head of the queue: 30
//Final Queue:[30, 40, 50]
//Not maintain insertion order
//contain duplicate values
//queue cannot contain null values although some implementations, such as LinkedList, do not prohibit insertion of null.
// In case of PriorityQueue it gives null pointer exception.

