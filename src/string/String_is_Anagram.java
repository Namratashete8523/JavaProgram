package string;

import java.util.Arrays;

public class String_is_Anagram {

	public static void main(String[] args) {
	String str1="Namrata";
	String str2="amrataN";
	str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    
    if(str1.length()!=str2.length())
    {
    	System.out.println("Both the string are not Anagram");
    	
    }
    else
	{
    	char[] str_array1=str1.toCharArray();
    	char[] str_array2=str2.toCharArray();
    	Arrays.sort(str_array1);
    	Arrays.sort(str_array2);
if(Arrays.equals(str_array1, str_array2)==true)  
{
System.out.println("Both the string are Anagram");	
}
else
{
System.out.println("Both the strings are not Anagram");	
}
    			}
	}

}
