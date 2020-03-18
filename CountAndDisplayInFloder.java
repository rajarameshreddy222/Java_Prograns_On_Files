package Files;

import java.io.File;


public class CountAndDisplayInFloder
{
	public static void main(String args[]) throws Exception
	{
	  File f=new File("C://Program Files");
	 
                    File arr[]=f.listFiles();
                    System.out.println(arr.length);
                    for(int i=0;i<arr.length;i++)
                    {
                    	System.out.println(arr[i].getName());
                    }
	    
	 	}
	
	
}
