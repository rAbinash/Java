/******************************************************************************

print the hollow diamond inscribed in a rectangle pattern.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j;
		for(i=1;i<=n*2;i++)
		{
		     for(j=1;j<=n*2;j++)
		     {
		     if(i+j<=n+1||i+j>=n+i*2||i+j>=n+j*2||i+j>=n*3+1)
		        System.out.print("*");
		     else
		        System.out.print(" ");
		     }
		     System.out.println();
		}
	}
}
