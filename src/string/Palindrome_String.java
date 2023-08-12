package string;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   String reverse="";
  String temp=str;

  for(int i=str.length()-1;i>=0;i--)
  {
	  reverse=reverse+str.charAt(i);
	  
  }
  
  if(temp.equals(reverse))
  {
	  System.out.println("String is a palindrome");
  }
  else
  {
	  System.out.println("Strinng is not a Palindrome");
  }
	}

}
