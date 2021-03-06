import java.io.*;
import java.util.*;

public class FileArray 
{

	public static void writeArray(String fn, int[] c)
	{
		PrintWriter write;
		try {
			write = new PrintWriter(fn);
			
			for(int num : c)
				write.println(num);   

			write.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

	public void readArray(String fn, int[] c)
	{
		File file = new File(fn);
		Scanner scan;
		try {
			scan = new Scanner(file);
			
			int i = 0;
			
			while(scan.hasNext()) {
				c[i] = Integer.parseInt(scan.next());
				i++;
			}
			
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException
	{
		int nums [] = {1,2,3,4,5,6,7,8,9,10};
		String fn = "testing.txt";
		
		writeArray(fn, nums);
		
		int newNums[] = new int[nums.length];
		FileArray fa = new FileArray();
		fa.readArray(fn, newNums);
		for(int num :  newNums)
			System.out.println(num);
	}
}
