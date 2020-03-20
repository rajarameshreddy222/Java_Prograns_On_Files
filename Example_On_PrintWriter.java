package Files;
import java.io.PrintWriter;
public class Example_On_PrintWriter {

	public static void main(String[] args) throws Exception
	{
		PrintWriter out=new PrintWriter("E://files/pw.txt");
		   out.println("line 1");
		   out.print("hai ");
		   out.println(100);
		   out.print(23.4);
		   out.print('c');
		   out.print(true);
		   out.flush();
		
		


	}
}
