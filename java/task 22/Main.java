/******************************************************************************

write a java program to check whether a number is duck number or not.
(A duck number is a number that has zeroes present in it,but there should be no zero 
present at the beginning of the number)

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    if(s.contains("0")&&s.charAt(0)!=48)
	        System.out.print("Duck number");
	    else
	        System.out.print("not a duck");
	}
}

