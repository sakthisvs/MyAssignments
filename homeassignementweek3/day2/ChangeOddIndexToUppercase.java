package homeassignementweek3.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) 
	{

		String obj ="changeme";
		
		char char1[] = obj.toCharArray();
		//System.out.println(char1);    //string to character
		
		for (int i = 0; i < char1.length; i++) 
		{
			//System.out.println(char1[i]); // printing in character wise
		
		
		 if ( i % 2 != 0)
		 {
			 char1[i] = Character.toUpperCase(char1[i]);
		 }	
		
	}
		System.out.print(char1);
}
}