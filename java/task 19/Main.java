/******************************************************************************

write a program to segregate all 0s on left side and all 1s on the right side of a 
given array 0s and 1s.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt(),i,j;
	     int a[]=new int[n+1];
	     for(i=1;i<=n;i++)
	          a[i]=sc.nextInt();
	     for(i=1;i<=n;i++)
	     {
	          for(j=i+1;j<=n;j++)
	          {
	               if(a[i]>a[j])
	               a[i]=a[i]+a[j]-(a[j]=a[i]);
	          }
	     System.out.print(a[i]+" ");
	     }
	}
		
}
