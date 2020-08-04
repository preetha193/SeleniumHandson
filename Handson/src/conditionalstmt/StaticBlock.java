package conditionalstmt;

public class StaticBlock {
	
	static 
	{
		System.out.println("This is first static block");
	}

	static
	{
		System.out.println("This is second static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main block");
	}//static will be executed first

}
