package string;

public class Convert_String_inCharactorArray {
	public static void main(String args[])
	{
	String str="Namrata";
	
    String str2=str.toLowerCase();
	char[] ch=new char[str.length()];

	for(int i=0;i<ch.length;i++)
	{
ch[i]=str2.charAt(i);
	}
	for(char c:ch)
	{
	System.err.println(c);
	}
	}

}
