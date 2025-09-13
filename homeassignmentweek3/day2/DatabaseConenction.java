package homeassignmentweek3.day2;

public interface DatabaseConenction 
{
	
	// 1 class to class -> can extends 
	// 2.Class implements interface -> interface
	
    public void connect();  	// all methods inside interface are public and abstract
    public void disconnect();  	// will force you add implement method 
    public void executeUpdate();// 
    
    public static void check1() // By adding default and static this method will not force you add implement
    {
    	System.out.println(" to check method is force to add impltement method-NO");
	}
    
    
}
