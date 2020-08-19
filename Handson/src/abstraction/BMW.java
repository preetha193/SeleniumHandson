package abstraction;

public class BMW extends Car implements Upcomingprojects{
	
	
	/*Create a parent class and two child class extends parent class separately. But there is no difference for both child class since it is getting output stmts from parent class.
So child class decided to override the method of parent class.
With same method name and parameter but different actions say sysout different..
This is nothing but override. */
	
	/* if a child class did not implement all abstract class, then it cannot be abstract
	 * if it is using all the abstract methods of parent class, then it has to be declared as abstract class.
	 * 
	 */
	
	public void engineSecret()
	{
		System.out.println("BMW engine secret");
	}

	public void companyValut()
	{
		System.out.println("BMW Vault secret");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//we are using dynamic polymorphism i.e overriding
		//using the parent class and creating object for child class and calling the parent class.
		Car car=new BMW();
		car.companyValut();
		car.engineSecret();

		
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

}
