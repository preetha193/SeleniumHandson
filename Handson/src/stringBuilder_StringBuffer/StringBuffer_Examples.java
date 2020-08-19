package stringBuilder_StringBuffer;

public class StringBuffer_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String is immutable i.e cannot be changed");
		String name="Preetha";
		System.out.println("joining the names: " +name.concat("Selvaraj"));
		System.out.println("After Concatination: "+name); // o/p will be Preetha bcos string is not changebale 
															//and we assigned already as preetha and it displays the same name.
		
		//String buffer function
		StringBuffer SBuffer= new StringBuffer("Preetha");
		System.out.println("Using StringBuffer which is mutable, it appends or concats any string with its original: ");
		System.out.println("appended string:" +SBuffer.append("Selvaraj"));
		System.out.println("Final Output: "+SBuffer);
		
		//StringBuffer methods: Reverse 
		
		System.out.println("REverse string: "+SBuffer.reverse());
		
		//Replace
		StringBuffer Sname= new StringBuffer("Preetha Selvaraj");
		System.out.println("Replaced String: "+Sname.replace(8, 16, "KArthik")); // text replacement
		System.out.println("Replaced String: "+Sname.replace(9,10,"a")); // single char replacement
		
		//Delete
		//System.out.println("Added one char: "Sname.append
		
		//String Sname1="Testing Practice";
		//System.out.println("Deleted Text: "+Sname1.);
		System.out.println("Appending int to the name: "+Sname.append(9));
		Object obj="geeks";
		System.out.println("Adding the object: "+Sname.append(obj));
		
		
		StringBuilder build= new StringBuilder("Test");
		System.out.println("The added content is: " +build.append("ing"));		
		System.out.println("Replacede content: "+build.replace(4, 7, "ING"));
		
		
		
		
		
		
		
		
		

	}

}
