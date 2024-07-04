/******************************************************************************

write a program to find the given number is emirp number?
(a prime number that results in a different prime when its digits are reversed)

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(),rev=0,flag=1;
	    int r=n;
	    while(n!=0){
	        rev=(rev*10)+(n%10);
	        n/=10;
	    }
	    for(int i=2;i<r;i++){
	    if(r%i==0 || rev%i==0){
	           flag=0;
	           break;
	        }
	    }
	    if(flag==1)
		System.out.println("Yes");
		else
		System.out.print("No");
	}
}
