/******************************************************************************

Given a number,write a program to find a maximum number that can be formed using 
all of the digits of this number.

*******************************************************************************/
import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     String s=sc.nextLine();
	     int a[]=new int[s.length()+1],i;
	     char b[]=s.toCharArray();
	     for(i=0;i<s.length();i++)
	     {
	         a[i]=b[i]-48;
	     }
	     Arrays.sort(b);
	     for(i=s.length()-1;i>=0;i--)
	     System.out.print(b[i]);
	}
}