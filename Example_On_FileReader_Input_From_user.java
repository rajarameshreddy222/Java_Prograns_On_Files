package Files;
import java.io.FileReader;
public class Example_On_FileReader_Input_From_user 
{

	public static void main(String[] args)
	{
		 try {  
				FileReader fr=new FileReader("e://Files/10 Q&ans.txt");
				int i=0;
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}
				
		        }
		        catch(Exception e)
		        {
		        	System.out.println(e);
		        }

	}

}
