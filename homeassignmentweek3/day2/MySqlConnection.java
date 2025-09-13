package homeassignmentweek3.day2;

public abstract class MySqlConnection implements DatabaseConenction
{
public abstract void executequery(); // Abstract method will force you add implement method
public abstract void executequery1();

	public void samplemethod()  // this method will not force you to add because its not a abstract method
	{
		System.out.println(" to check whether method is forcing to add in the class - no");
	}

}
