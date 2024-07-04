/******************************************************************************

write a program a find the given number is amicable number?
(two numbers are known as amicable numbers if the sum of proper divisors of one number
is equal to the other number.)

*******************************************************************************/
import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
          Scanner sc=new Scanner (System.in);
          int a =sc.nextInt(),s=0,t=0,i;
          int b =sc.nextInt();
          for(i=1;i<=a/2||i<=b/2;i++)
          {
               if(a%i==0)
               s+=i;
               if(b%i==0)
               t+=i;
               
          }
          System.out.print(a==t&&b==s?"Yes":"no");
	}
}