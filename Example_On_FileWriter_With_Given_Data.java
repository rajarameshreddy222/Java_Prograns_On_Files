package Files;

import java.io.File;
import java.io.FileWriter;

public class Example_On_FileWriter_With_Given_Data {

	public static void main(String[] args) throws Exception
	{
		File f=new File("E://files/RRR.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("raja");
		fw.write("ramesh");
		fw.write("reddy");
		fw.write("222");
		fw.flush();
		
		
	}

}
