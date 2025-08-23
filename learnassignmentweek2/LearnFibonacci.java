package learnassignmentweek2;

public class LearnFibonacci {

	public static void main(String[] args) {

		int n = 14;
		
		int first = 0;
		int second =1;
		
		System.out.println(" The Fibonacci series are : " +first+ "," +second);
		
		 for (int i = 0; i <= n; i++) 
		{
		 int next = first + second;
	 
	     System.out.println(","+ next);
	     
	     first = second;
	     second = next;  	     
	   	
		}
		
	}

	

}
