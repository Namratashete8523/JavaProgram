package number;

public class PrimeNumber_One_to_hundred {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++)
		{
			
			int num=i, count=0,m;
			
			m=num/2;
			if(num==0||num==1)
			{
				System.out.println(i+" is not prime number");
				
			}
			else
			{
				for(int j=2;j<=m;j++)
				{
					if(num%j==0)
					{
                   System.out.println(i+" is not a prime number");
					count++;
                   break;
					}	
					
				}
				
			}
			if(count==0)
			{
				System.out.println(i+ " is a prime number");
			}						
			
			
		}

	}

}
