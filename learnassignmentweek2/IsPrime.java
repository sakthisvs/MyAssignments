package learnassignmentweek2;

public class IsPrime {

	public static void main(String[] args) 
	{
		 System.out.println("Checking prime numbers from 1 to 50:");

	        for (int i = 2; i <= 50; i++)
	        {
	            boolean isPrime = true; // Assume the number is prime initially

	            // Numbers less than 2 are not prime
	            if (i < 2) {
	                isPrime = false;
	            } else {
	                // Check for divisibility from 2 up to half of the number
	                for (int j = 2; j <= i / 2; j++) {
	                    if (i % j == 0) {
	                        isPrime = false; // If divisible, it's not prime
	                        break; // No need to check further
	                    }
	                }
	            }

	            if (isPrime) {
	                System.out.println(i + " is a prime number.");
	            } else {
	                System.out.println(i + " is not a prime number.");
	            }
	        }
	    }



}
