package number;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=53, m, count=0;
		m=number/2;
		if(number==0||number==1)
		{
			System.out.println("number is not a prime number");
		}
		else {
		for(int i=2;i<=m;i++)
		{
			if(number%i==0)
			{
				System.out.println("number is not a prime number");	
			count++;
			break;
			}
				
			}
		if(count==0)
		{
			System.out.println("number is a prime number");	
		}
		
		}

	}

}
