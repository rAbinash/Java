/******************************************************************************

write a program to convert the given numbers to hexadecimal.

*******************************************************************************/
import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt(),i,j;
          String hex;
          int a[]=new int[n+1],r=0;
          char hx[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
          for(i=1;i<=n;i++)
               a[i]=sc.nextInt();
          for(i=1;i<=n;i++)
          {
               hex="";
               while(a[i]!=0)
               {
                    r=a[i]%16;
                    hex=hx[r]+hex;
                    a[i]/=16;
               }
               System.out.print(hex+" ");
          }
          
	}
}