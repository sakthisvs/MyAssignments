package homeassignmentweek3.day2;

public class JavaConnection1st implements DatabaseConenction

{

	public static void main(String[] args) 
	{
		JavaConnection1st s1 = new JavaConnection1st();
		s1.connect();
		s1.disconnect();
		s1.executeUpdate();
	}

	@Override
	public void connect() 
	{
		System.out.println("connected to sql db");
		
	}

	@Override
	public void disconnect() 
	{
		
		System.out.println("Disconnected to sql db");
	}

	@Override
	public void executeUpdate() 
	{
		
		System.out.println("Execute update");
	}

}
