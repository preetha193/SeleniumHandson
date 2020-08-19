package collections;

import java.util.LinkedList;

public class LinkedListStringexample {

	public static void main(String[] args) {
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("a");
		linkedlist.add("b");
		linkedlist.add("c");
		linkedlist.add("d");
		linkedlist.add("e");

		System.out.println("The elements in the list are: "+linkedlist);

		for (String string : linkedlist) 
			System.out.println("displaying the list one by one: " +string);

		linkedlist.addFirst("e");
		linkedlist.addLast("g");
		System.out.println("The elements in the list are: "+linkedlist);
		for(int i=0; i<linkedlist.size(); i++)
			{
				System.out.println("The elements in the linkedlist: "+linkedlist.get(i));
			}
		//get the first element:

		System.out.println("The first element: "+linkedlist.getFirst());
		System.out.println("removal of mentioned element: "+linkedlist.remove(3));
		System.out.println("The items list after removal: "+linkedlist);




	}


}


