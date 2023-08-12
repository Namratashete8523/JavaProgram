package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Compare_Two_arraryList {

	public static void main(String[] args) {
	List<String> strlist1=new ArrayList<String>();
	List<String> strlist2=new ArrayList<String>();
	strlist1.add("Namrata");
	strlist1.add("shete");
	strlist2.add("namrata");
	strlist2.add("Shete");
	System.out.println("1"+strlist1);
	System.out.println("2"+strlist2);
	
	// Convert the elements present in the list into lower case 
	for(int i=0; i<strlist2.size();i++)
	{
		String newvalue=strlist2.get(i).toLowerCase(Locale.ROOT);
		strlist2.set(i, newvalue);
	}
	System.out.println("3"+strlist2);
	
	for(int i=0; i<strlist1.size();i++)
	{
		String newvalue=strlist1.get(i).toLowerCase(Locale.ROOT);
		strlist1.set(i, newvalue);
	}
	System.out.println("4"+strlist1);
	
	// Sort the list alphabetically
	Collections.sort(strlist2);
	Collections.sort(strlist1);
	
	System.out.println("5"+strlist1);
	System.out.println("6"+strlist2);
	//Compare the List
if(strlist1.equals(strlist2))
{
System.out.println("String List 1 & 2 are same");	
}
else
{
	System.out.println("String List 1 & 2 are not same");	

}
	
	}

}
