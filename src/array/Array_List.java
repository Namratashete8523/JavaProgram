package array;

import java.util.*;
import java.util.Collections;
public class Array_List {

	public static void main(String[] args) {

		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		System.out.println(al1);
		
		System.out.println(al1.get(2));
	
	//	Add Element in between
		
		al1.add(2, 1);
		System.out.println(al1);
		
   // List mai jo pahale se likha gya hai element ko use set karege
		
		al1.set(0, 0);
		System.out.println(al1);
		
	// delete element
		
		al1.remove(2);
		System.out.println(al1);
		
     // Size of arraylist
		
		System.out.println(al1.size());
		
	// loops
		for(int i=0;i<al1.size();i++)
		{
			System.out.print(al1.get(i));
		}
		System.out.println();
	// sorting 
	
	al1.add(1,5);
	System.out.println("Adding 5 at 1st position=>"+al1);
	Collections.sort(al1);
	System.out.println("Sort the objects in array=>"+al1);
	}

}
