package week1.day2.Assignments;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int range=8,firstNum = 0, secondNum =1,sum;
		System.out.print(firstNum+" ");		// print 0 only alone
		
		for(int i=1;i<range;i++)
		{
			sum=firstNum+secondNum;			// sum assigned the value of addition -> firstNum and secondNum 
			firstNum = secondNum;			// firstNum assined the value of secondNum
			secondNum=sum;					// secondNum assigned the value if sum
			System.out.print(firstNum+" ");
		}
	}
}
