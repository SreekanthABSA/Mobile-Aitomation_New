package com.org.absa.beneficiaries;
import com.org.Mobile.MobileTest.*;


public class AddBeneficiary  extends AppTest {

	public static void main(String[] args) {
		
		try {
			
			cap();
			Thread.sleep(5000);
			prelogin();
			addbenAirtime();
			
		    
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	   
	    }
	
	public static void addbenAirtime() throws InterruptedException 
	{
		
	}

}
