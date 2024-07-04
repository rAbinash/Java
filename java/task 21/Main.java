/******************************************************************************

write a program to get the last index of each char within a string.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    int i;
	    for(i=0;i<a.length();i++)
	    System.out.print(a.lastIndexOf(a.charAt(i))+" ");
	}
}