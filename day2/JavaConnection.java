package homeassignmentweek3.day2;

public class JavaConnection extends MySqlConnection implements DatabaseConenction
{

	public static void main(String[] args) 
	{
		JavaConnection s = new JavaConnection();
		s.connect();
		s.disconnect();
		s.executeUpdate();
		s.executequery();	
		s.executequery1();
		s.samplemethod();
	}

	@Override
	public void connect() 
	{		
	System.out.println("connected to sql db");		
	}

	@Override
	public void disconnect() 
	{		
		System.out.println("Disconnected from sql db");
	}

	@Override
	public void executeUpdate() 
	{
		System.out.println("Execute DB");		
	}

	@Override
	public void executequery() 
	{
		System.out.println("Execute query");
		
	}

	@Override
	public void executequery1() 
	{
		System.out.println("Execute query1");
		
	}
     

}
