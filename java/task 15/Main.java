/******************************************************************************

write a program to insert an element(specific position) into an array.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt(),i;
	     int a[]=new int[n+2];
	     for(i=1;i<=n;i++)
	          a[i]=sc.nextInt();
	     int p=sc.nextInt();
	     int v=sc.nextInt();
	     for(i=n;i>=p;i--)
	          a[i+1]=a[i];
	     a[p]=v;
	     for(i=1;i<=n+1;i++)
	          System.out.print(a[i]+" ");
	}
}