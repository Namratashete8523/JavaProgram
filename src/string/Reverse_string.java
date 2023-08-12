package string;

public class Reverse_string {

	public static void main(String[] args) {
	String str="Namrata Shete", reverse="";
	int m;
	m=str.length();
	for(int i=m-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
		
	}
System.out.println(reverse);
	}

}

