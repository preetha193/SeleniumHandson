package conditionalstmt;

public class Joinnames {

	String Fname="Preetha";
	String Lname="Selvaraj";
	String Fullname="   Preetha Machampalayam Selvaraj  ";
	String completesentence= "hi this is preetha and hru wru";

	public void trim()
	{
		String join=Fname+Lname;
		System.out.println("Joined name is:" +join);
	}
	public void join()
	{
		String join1=completesentence.replaceAll(" ", "");
		System.out.println("The space removed sentence: "+join1);
		String concat=completesentence.concat(completesentence);
		String spaceremoved=Fullname.trim();
		System.out.println("Splitted name is: "+concat);
		System.out.println("Splitted name is: "+spaceremoved.trim()); //it removes front and back empty spaces
		System.out.println("Splitted name is: "+spaceremoved);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joinnames obj=new Joinnames();
	//	obj.trim();
		obj.join();

	}

}
