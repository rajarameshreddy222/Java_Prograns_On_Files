package Files;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

import java.io.FileOutputStream;
public class Example_On_BufferedInputStream_And_BufferedOutputStream {

	public static void main(String[] args) throws Exception
	{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("e://abc.jpg"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("e://abb.jpg"));
		
		int i=0;
		while((i=bis.read())!=-1)
		{
		    bos.write(i);	
		}
		bos.flush();

	}

}
