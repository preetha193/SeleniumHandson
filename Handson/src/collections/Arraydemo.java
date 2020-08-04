package collections;

import java.math.BigDecimal;

public class Arraydemo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"i) double a = 100; big decimal b=100; how to multiply a and b
		//		ii) Convert a big decimal to double"

		
		double a=100; 
		double b = new BigDecimal(100).doubleValue(); //now b is conv from bigdecimal to double using doublevalue()
		double c = a*b;
		System.out.println(c);
		
		
			


		


	}

}
