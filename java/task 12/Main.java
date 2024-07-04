/******************************************************************************

write a program to convert the decimal to binary and remove all the zero and convert it back to decimal.
(5->to binary->101->remove zeros(101)->11->to decimal->13)

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),b=1,s=0,t,m=0;
		t=n;
		while(n!=0)
		{
		     s+=b*(n%2);
		     b*=10;
		     n/=2;
		}
		b=1;
		while(s!=0)
		{
		     if(s%10!=0)
		     {
		          m+=b*(s%10);
		          b*=2;
		     }
		     s/=10;
		}
		System.out.print(m);
	}
}