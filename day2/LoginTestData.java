package homeassignmentweek3.day2;

public class LoginTestData extends TestData
{

	public void enterUsername()
	{
		System.out.println("enter the username");
	}
	
	public void enterPassword()
	{
		System.out.println("enter the Passoword");
	}
	
	public static void main(String[] args) 
	{
		TestData obj1 = new TestData();
		System.out.println("the below are from super class");
		obj1.enterCredentials();
		obj1.navigateToHomePage();
		System.out.println(" ");
		
		
		
		LoginTestData obj = new LoginTestData();
		System.out.println("the below are from sub class");
		obj.enterCredentials();
		obj.navigateToHomePage();
		obj.enterUsername();
		obj.enterPassword();
		
	}
}
