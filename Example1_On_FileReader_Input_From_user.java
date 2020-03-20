package Files;

import java.io.FileReader;

public class Example1_On_FileReader_Input_From_user {

	public static void main(String[] args) throws Exception
	{
	FileReader fr=new FileReader("E://files/RRR.txt");
	int ch;
	while((ch=fr.read())!=-1) 
	{
		System.out.println((char)ch);
	}

	}

}
