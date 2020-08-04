package collections;

import java.util.TreeSet;

public class TreeSetExample {


	public void treefunc()
	{
		TreeSet<Integer> tree=new TreeSet<Integer>();
		//tree.add(null); => it raises null pointer exception
		tree.add(1);
		tree.add(4);
		tree.add(9);
		tree.add(2); 
		tree.add(0);

		System.out.println("Tree output: "+tree);
		System.out.println("Tree add: "+tree.add(11));
		System.out.println("Tree output: "+tree);
		System.out.println("Tree output: "+tree.first());
		// headset will display from start of the list to the element 
		//before it is mentioned in the headset(); here it will display before 9
		System.out.println("Tree output: "+tree.headSet(9));
		//trail will display the inclusive of that mentioned element and the upcoming elements in the list
		System.out.println("Tree output: "+tree.tailSet(2));
		//subset gives the elements bet start and end values..say [0,1,2,4,9,11] if we say bet 2 and 9, it displays 2,4
		System.out.println("Tree output: "+tree.subSet(2, 9));
		System.out.println("Tree output: "+tree.subSet(2, 2)); //it displays [] empty
		System.out.println("Tree higher: "+tree.higher(2)); // it checks what is the next element after (2) is higher.. from the list, 4 is the next highest.
		System.out.println("Tree output: "+tree.lower(11));  //o/p: 9 , it checks which one is lower than 11
		
		System.out.println("Tree first poll: "+ tree.pollFirst() + " Tree last Poll: " +tree.pollLast());
		System.out.println("Tree output: "+tree);
		System.out.println("Tree output: "+tree.descendingSet());
		System.out.println("Tree output: "+tree.comparator());

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSetExample obj=new TreeSetExample();
		obj.treefunc();
	}

}
