package string;


public class Reverse_string_but_aintai_original_space {
	public static void main(String[] args) {
	String str=" Namrata She te";
	char[] char_arr=str.toCharArray();
	char[] char_result=new char[char_arr.length];
	for(int i=0;i<char_arr.length;i++)
	{
		if(char_arr[i]==' ')
		{
			char_result[i]=' ';
		}
	}
	// Traverse the string from beginning and put the character in result from end 	
	int j=char_result.length-1;
		for(int i=0;i<char_arr.length;i++)
		{
			if(char_arr[i]!=' ')
			{
				if(char_result[j]==' ')
				{
					j--;
				}
				char_result[j]=char_arr[i];
				j--;
			}
			
		}
		System.out.println("Reverse String Maintain Space=>"+String.valueOf(char_result));
		
	}
	
	
	}
	

