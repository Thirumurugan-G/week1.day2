package week1.day2.Assignments;

public class Factorial 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Factorial");
		int input =5,fact=1,i;   			// declared three variables
		for(i=input;i>=1;i--)
		{
			fact=fact*i;
			System.out.print(i);
			if(i>1)							// just for reference 
				System.out.print("*");
		}
		System.out.println("="+fact);		// result 
	}
}
