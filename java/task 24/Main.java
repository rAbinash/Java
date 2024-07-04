/******************************************************************************

write a program to print the pattern like pyramid in reverse and normal string.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int i,j,k,m=s.length();
	for(i=0;i<m;i++)
	{
	     for(j=0,k=0;j<m;j++)
	     {
	        if(i+j>=m-1)
	        System.out.print(s.charAt(k++)+" ");
	        else
	        System.out.print("  ");
	     }
	    System.out.print(" ");
	    for(k=i,j=0;j<=i;j++)
    	{
	    System.out.print(s.charAt(k--)+" ");
    	}
	System.out.println();
	}
  }
}
