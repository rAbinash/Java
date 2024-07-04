/******************************************************************************

print the following pattern. if we give input 5 it shows the downward desending
number pattern.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int n = sc.nextInt(),i,j,c,s;
	    for(i=1;i<=n;i++){
	        c=i;s=n;
	        for(j=i;j<=n;j++){
	            System.out.print(c+" ");
	            c+=s--;
	    }
	    System.out.println();
	    }
	}
}
