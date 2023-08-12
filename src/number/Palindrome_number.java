package number;

public class Palindrome_number {

	public static void main(String[] args) {
	int num= 121, temp, reverse=0;
	temp=num;
	while(num>0)
	{
		reverse=reverse* 10;
	reverse=reverse+num%10;
    num=num/10;
	}
	if(temp==reverse)
	{
	System.out.println("String is a Palindrome number" );	
	
	}
	else
	{
	System.out.println("not a Palindrome number");	
	}
	}

}
