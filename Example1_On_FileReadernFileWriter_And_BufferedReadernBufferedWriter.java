package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Example1_On_FileReadernFileWriter_And_BufferedReadernBufferedWriter 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("E://files/rrr.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("E://files/vrrr.txt"));
        String str=null;
        while((str=br.readLine())!=null)
        {
        	bw.write(str);
        }
        br.close();
        bw.close();
	}

}
