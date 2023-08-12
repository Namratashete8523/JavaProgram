package string;

public class Count_uppercasechar {

	public static void main(String[] args) {
		String str="Namret123a@";
		int strlength=str.length();
System.out.println("str Length=>"+strlength);

int upper=0,lower=0,digit=0,special=0;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);	
if(ch>='A' && ch<='Z')
	upper++;
else if(ch>='a' && ch<='z')
	lower++;
else if(ch>='0' && ch<='9')
	digit++;
else 
	special++;
	
}
System.out.println("Count of uppercase charactor=>"+upper);
System.out.println("Count of lowercase characto=>"+lower);
System.out.println("Count of digits characto=>r"+digit);
System.out.println("Special=>"+special);

System.out.println("String convert into lowercase=>"+str.toLowerCase());
	}

}
