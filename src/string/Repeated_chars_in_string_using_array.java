package string;

public class Repeated_chars_in_string_using_array {

	public static void main(String[] args) {
		String str="Namrata Shete";
		int count=0;
		char ch[]= str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
			count++;
			break;
			}
			}			
		}
System.out.println("Repeated Charactor in string using charactor array"+count);
	}

}
