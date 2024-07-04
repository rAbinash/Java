/******************************************************************************

write the LEADERS in the array.
(an element is leader if its greater than all the the elements to its right side.)

*******************************************************************************/
import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt(),f=0,i,j;
	     int a[]=new int[n+1];
	     for(i=1;i<=n;i++)
	          a[i]=sc.nextInt();
	     for(i=1;i<=n+1;i++)
	          {
	               for(j=i+1;j<=n;j++)
	               {
	                    f=1;
	                    if(a[i]<a[j])
	                    {
	                    f=0;
	                    break;
	                    }
	                    
	               }
	     if(f==1||i==n)
	          System.out.print(a[i]+" ");
	          }
	}
}