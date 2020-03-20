package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example_On_FileInputStream_And_FileOutputStream {

	public static void main(String[] args) throws Exception 
	{

		  FileInputStream fis=new FileInputStream("e://rr.mp4");
		  FileOutputStream fos=new FileOutputStream("d://rr.mp4");
		 int i=0;
		 while((i=fis.read())!=-1)
		 {
			 fos.write(i);
		 }
		 fos.flush();

	}

}
