/******************************************************************************

write a program to generate a EB bill with below constraints.
0-50(free)
51-150(Rs.3/unit)
151-250(Rs.5/unit)
Above 250(Rs.7)

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();float sum=0;
	    if(n>250){
	        sum+=(n-250)*7;
	       n-=(n-250);
	    }
	    if(n>150){
	        sum+=(n-150)*5;
	        n-=(n-150);
	    }
	    if(n>50){
	        sum+=(n-50)*3;
	        
	    }
	    sum=sum+sum/5;
	    if(sum==(int)sum)
		System.out.println((int)sum);
		else
		System.out.println(sum);
	}
}
