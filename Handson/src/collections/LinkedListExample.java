package collections;

import java.util.LinkedList;

public class LinkedListExample {

	
	public void LinkedExample() {
		LinkedList<Integer>linkedList=new LinkedList<Integer>();
		
		
			
			
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		
		System.out.println("The list: "+linkedList);
		//add an element to the first position linked list
		
		for(Integer obj2: linkedList) //it displays the elements one by one
			System.out.println("The elements in the linked list: " +obj2);
		
		linkedList.addFirst(1);
		linkedList.addLast(5); // we are adding 5 again, duplication accepted
		
		System.out.println("The newly added item: " +linkedList);
		
		//iterate the list
		
		for(int i=0; i<linkedList.size();i++)
		{
			System.out.println("The elements in the list are: " +linkedList.get(i));
		}
		
		
			
		//get the first element
		System.out.println("The first element of the list: " +linkedList.getFirst()+ " The last element of the list: "+linkedList.getLast());
		System.out.println("Removal of first element: " +linkedList.removeFirst()+ "Removal of last element: "+linkedList.removeLast());
		System.out.println(linkedList);
		
		//poll method to delete
		
		System.out.println("The removal of first element: "+linkedList.pollFirst());
		System.out.println("The removal of last element: "+linkedList.pollLast());
		//System.out.println(linkedList);
		//System.out.println("Using Poll method: " +linkedList.poll());
		System.out.println(linkedList);
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListExample obj=new LinkedListExample();
		obj.LinkedExample();
	}

}
