/******************************************************************************

write a program to count the number of pairs whose sum is equal to a given number.

*******************************************************************************/
import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt(),i,j,t=0;
	     int a[]=new int[n+1];
	     for(i=1;i<=n;i++)
	          a[i]=sc.nextInt();
	     int s=sc.nextInt();
	     for(i=1;i<=n;i++)
	          for(j=i+1;j<=n;j++)
	               if(a[i]+a[j]==s)
	               t+=1;
	     System.out.print(t);
	}
}
