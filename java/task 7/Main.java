/******************************************************************************

write a program to get a number(n) and print 1-n/2 with space and n/2+1-n with comma and end with dot 
and exlude the numbers start/end with 3.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=1;i<=n/2;i++){
	        if(i%10==3 || i/10==3)
	        continue;
	        else
	        System.out.print(i+" ");
	    }
	    for(int i=1+n/2;i<=n;i++){
	        if(i%10==3 || i/10==3)
	        continue;
	        else if(i==n)
	        System.out.print(i+".");
	        else 
	        System.out.print(i+",");
	        
	    }
	}
}
