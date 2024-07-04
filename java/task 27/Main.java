/******************************************************************************

write a program to replace the 2nd character with the 3rd character in each word.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int l=0;
	for(String i:s.split(" "))
	{
	    l=i.length();
	    if(l>2)
	    i=i.replace(i.charAt(1),i.charAt(2));
	    System.out.print(i+" ");
	}
	}
}
