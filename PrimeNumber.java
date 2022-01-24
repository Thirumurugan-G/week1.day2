package week1.day2.Assignments;

public class PrimeNumber 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int input = 13;
		boolean flag= false ;
		int num=input/2;		// 13/2=6.5 -> 6 assigned in num 
		
		if(input==0||input==1)  	// check input 0 or 1. 
		{
			System.out.println(input+" is not a prime numer");		
		}
		else
		{
			for(int i=2;i<=num;i++)		// iterated with 2 and check 2<=6
			{
				if(input % i == 0)		// reminder is 1 -> condition false
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(input+" is a prime number");
			}
			else
			{
				System.out.println(input+" is not a prime number");
			}
		}
	}
}