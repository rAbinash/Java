/******************************************************************************

write a program to check a number is cube or not.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(),i,flag=0;
	    for(i=1;i<=n;i++){
	        if(n%i==0 && (i*i*i)==n)
                flag=1;
	    }
	   	 if(flag==1)
	   	 	        System.out.print(n+" is a cube number");
	        else
	        System.out.print(n+" is not a cube number");
	}
}
