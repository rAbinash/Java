/******************************************************************************

write a program to get 2 numbers to power each other and print the biggest number among them.

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
	    InputStreamReader x = new InputStreamReader(System.in);
	    BufferedReader y=new BufferedReader(x);
	    int a = Integer.parseInt(y.readLine());
	    int b = Integer.parseInt(y.readLine()),p=1,q=1;
	    int i=1;
	while (i++<=b) {
	    p*=a;
	}
	i=1;
	while(i++<=a){
	    q*=b;
	}
		System.out.println(p>q?p:q);
	}
}
