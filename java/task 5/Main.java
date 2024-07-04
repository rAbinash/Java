/******************************************************************************

write a program to get a one number from command line and one number from InputStreamReader
and find the product of the numbers.

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException 
	{
	   InputStreamReader x = new InputStreamReader(System.in);
	   BufferedReader y=new BufferedReader(x);
	    int a=Integer.parseInt(args[0]);
	    int b=Integer.parseInt(y.readLine());
		System.out.println(a*b);
	}
}
