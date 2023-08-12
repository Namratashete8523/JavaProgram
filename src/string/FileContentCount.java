package string;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {
static String path="C:\\Users\\DELL\\OneDrive\\Desktop\\seleniumtext.txt";

	public static void main(String[] args) {
	int LineCounter=0, wordCounter=0, charCounter=0;
	try {
	BufferedReader reader=new BufferedReader(new FileReader(path));
	String	currentLine=reader.readLine().trim();
	while(currentLine!=null)
	{
		LineCounter++;
		String words[]=currentLine.split(" ");
		wordCounter=wordCounter+words.length;
		
	//char count 
		for(String word: words)
		{
			charCounter=charCounter+ word.length();
		}
		currentLine=reader.readLine();
	    }
	System.out.println("Total Line count=>"+LineCounter);
	System.out.println("Total word count=>"+wordCounter);
	System.out.println("Total charactor count=>"+charCounter);
			} catch (IOException e)
	{
	
		e.printStackTrace();
	}
	
	}

}
