package homeassignmentweek3.day2;


public class Elements extends button
{

	public static void main(String[] args) 
	{
		
		WebElement obj = new WebElement();
		obj.click();
		obj.setText("Hello");
		System.out.println("  ");
		
		button obj1 = new button();
		obj1.click();
		obj1.setText("Click the Button");
		obj1.submit();
		System.out.println("  ");
		
		TextField obj2 = new TextField();
		obj2.setText("usernamesakthi");		
		obj2.getText();
		System.out.println("  ");
		
		CheckBoxButton obj3 = new CheckBoxButton();
		obj.click();
		obj3.setText("select the checkbox : Yes / no");				
		obj3.ClickCheckButton();
		obj3.submit();
		System.out.println("  ");
		
		RadioButton obj4 = new RadioButton();
		obj4.click();
		obj4.selectRadioButton();
		obj4.setText("select the radio button M/F");
		
		
		
	}

}