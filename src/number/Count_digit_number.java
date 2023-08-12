package number;

public class Count_digit_number {

	public static void main(String[] args) {
		int number=100000;
		int count=0;
		while(number>0)
	
	{
			number=number/10;
			count++;
	}
System.out.println("count of Digit in given number=>"+count);
	}

}
