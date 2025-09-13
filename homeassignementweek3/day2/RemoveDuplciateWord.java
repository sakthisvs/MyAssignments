package homeassignementweek3.day2;

public class RemoveDuplciateWord {

	public static void main(String[] args)
	{
		String text = "I am a software tester";
		String words[] =text.split(" ");
		for (int i = 0; i < words.length; i++) 
		{
			if (i % 2 != 0)
			{
				char chars[] = words[i].toCharArray();
				for (int j = chars.length-1; j>0; j--) 
				{
				 System.out.println(chars[j]);	
				}
			} 
			else
			{
				System.out.println(words[i]);
			}
				System.out.println(" ");
		}
		
		

	}

}
	
