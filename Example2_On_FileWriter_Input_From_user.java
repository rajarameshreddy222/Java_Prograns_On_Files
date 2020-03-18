package Files;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Example2_On_FileWriter_Input_From_user 
{

	public static void main(String[] args) throws Exception
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");
	String str=s.nextLine();
	File f=new File("e://Files/abc.txt");
	
	FileWriter fw=new FileWriter(f,true);
	fw.write(str);
	fw.flush();
	}

}
