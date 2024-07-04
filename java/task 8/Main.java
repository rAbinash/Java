/******************************************************************************

write a program to find the difference between the biggest and smallest digits in given number.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt(),min=0,max=9;
	    while(n!=0){
	        if(n%10>min)
	        min=n%10;
	        if(n%10<max)
	        max=n%10;
	        n/=10;
	    }
	    
		System.out.println(min-max);
	}
}
