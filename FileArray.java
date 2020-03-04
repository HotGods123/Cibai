import java.io.*;
import java.util.*;

public class FileArray 
{
	public static String fileName;
	public static int content;
	
	public static void writeArray(String fn, int c) 
	{
		fileName = fn;
		content = c;
	}
	
	public void readArray(String fn, int c)
	{
		fileName = fn;
		content = c;
	}
	
	public static void main(String[] args) throws IOException
	{
		ArrayList<Integer> contents = new ArrayList<>();
			contents.add(12345);
			contents.add(67890);
		for(int i = 0; i <= contents.size(); i++)
		{
			System.out.print(content);
		}
		//try 
		//{
			//FileWriter file1 = new FileWriter(fileName);
		//}
	}
	
	
	
	
	
}
