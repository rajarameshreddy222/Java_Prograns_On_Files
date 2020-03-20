package Files;

import java.io.FileOutputStream;

public class Example_On_FileOutputStream {

	public static void main(String[] args) throws Exception
	{
		 FileOutputStream fos=new FileOutputStream("e://abc.txt");
		  String str="hai this is string";
		    byte b[]=str.getBytes();
		    fos.write(b);
		    fos.flush();

	}

}
