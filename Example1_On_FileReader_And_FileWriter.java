package Files;
import java.io.FileReader;
import java.io.FileWriter;



public class Example1_On_FileReader_And_FileWriter 
{

	public static void main(String[] args) throws Exception
	
	{
		FileReader fr=new FileReader("e://files/rrr.txt/");
		FileWriter fw=new FileWriter("e://files/vrrr.txt/");
		int ch;
		while((ch=fr.read())!=-1)
		{
			fw.write(ch);
		}
		fr.close();
		fw.flush();

	}

}
