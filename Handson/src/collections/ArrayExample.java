package collections;

import java.util.List;
import java.util.ArrayList;



public class ArrayExample {
	
	public void arrayListExample()
	{
		//if no generic is added, we can add any data type to the list
		// we are using array List
		//<String> is nothing but the input passed is string in the list. if we try to add an integer, then it will throw an error since it s declared as string
		List <String> arrayList=new ArrayList<String>();
		//syntax is List <data_type> object=new ArrayList<data_type>();
		//adding the elements to the array, here arrayList is the object
		arrayList.add("BMW");
		arrayList.add("Benz");
		arrayList.add("Bentley");
		arrayList.add("BMW");
		System.out.println(arrayList.get(1)); 
		System.out.println(arrayList.indexOf("BMW")); // it display the first occurrence of array index
		System.out.println(arrayList.lastIndexOf("BMW")); //it displays the last index of the given array since arraylist allows duplication
		//if any element which is not available in the array, it will return -1
		System.out.println(arrayList.indexOf("Maruti"));
		//copy the list of string to another list
		List <String> anotherList= new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println("The list is added to a new List: " +anotherList);
		
		//to remove any particular element,
		System.out.println("Removing one element:" +arrayList.remove("BMW"));
		System.out.println(arrayList);
		//to remove any particular element thru index
		System.out.println("Removing one element: "+arrayList.remove(1));
		System.out.println(arrayList);
		
		
		//to clear the list of elements in the another list
		anotherList.clear();
		System.out.println(anotherList);
		// null insertion is possible
		arrayList.add(null);
		System.out.println(arrayList);// o/p contains "null"
		
		//to replace any element
		arrayList.set(0,"Chevvy");
		System.out.println(arrayList);
		
		//to check the array empty?
		System.out.println(arrayList.isEmpty());
		
		//Iterate
		//to print all the elements from the array so use for each loop
		//syntax would be 
		//for(String obj name: object of the list created in main method
		for (String string : arrayList) {
			System.out.println(string);
		}
		//using normal for loop
		for(int i=0; i<arrayList.size(); i++)
			System.out.println("Using For Loop: "+arrayList.get(i));
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an object called arrayList to the class.		
		ArrayExample arrayList= new ArrayExample();
		//calling arrayListExample() method using the created object
		arrayList.arrayListExample();
	}

}
