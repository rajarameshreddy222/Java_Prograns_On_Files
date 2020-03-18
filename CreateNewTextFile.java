package Files;
import java.io.File;
import java.io.IOException;
public class CreateNewTextFile {
	public static void main(String[] args) 
	{
		File f=new File("E://Files/RR1.txt");
		try {
			f.createNewFile();
		    } 
		  catch (IOException e) 
		  {
			System.out.println(e);
		}
	}

}
