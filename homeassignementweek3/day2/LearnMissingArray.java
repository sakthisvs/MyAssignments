package homeassignementweek3.day2;

import java.util.Arrays;
import java.util.Iterator;

public class LearnMissingArray {

	public static void main(String[] args) 
	{
		int arr[] = {1,4,3,2,8,6,7};
		//1 2 3 4 6 7 8
		//0 1 2 3 4 5 6
		Arrays.sort(arr); //sorting array
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			if (arr[i + 1] != arr[i] + 1)
			{
				System.out.println("Missing number is :" + (arr[i]+1) );
				break;
			}																		
		}		
	}
}


//0       0+1=1=2      	 =    1+1=2
// 1      1+1=2=3        =    2+1=3
// 2      2+1=3=4        =    3+1=4 
// 3      3+1=4=6        =    4+1=5
