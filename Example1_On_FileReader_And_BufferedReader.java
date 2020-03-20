package Files;

import java.io.FileReader;
import java.io.BufferedReader;

public class Example1_On_FileReader_And_BufferedReader
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("E://files/rrr.txt"));
		String str=null;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
	}
}
