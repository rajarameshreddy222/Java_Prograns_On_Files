package Files;

import java.io.File;
import java.io.FileWriter;
public class Example3_On_FileWriter_Input_From_user {

	public static void main(String[] args)throws Exception 
	{

	File f=new File("E://VRRR.txt");
	FileWriter fw=new FileWriter(f);
	fw.write(" hi ");
	fw.write("niit");
	fw.write(199);
	fw.flush();
	

	}

}
