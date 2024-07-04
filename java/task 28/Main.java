/******************************************************************************

write a program to remove a character from a string to make it a palindrome.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int i=0,l=s.length(),f=0;
	char a[]=s.toCharArray();
	for(int j=0;j<l/2;j++)
	{
	for(i=0;i<l/2;i++)
	{
	    
	    if(a[i]!=a[l-i-1])
	        f=1;
	    else
	        f=0;
	   
	}
	}
	System.out.print(f==1?"yes":"no");
}
}