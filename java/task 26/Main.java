/******************************************************************************

write a program to find whether the given string is a palindrome or not.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    StringBuffer y = new StringBuffer(s);
	    if(s.equals(new String(y.reverse())))
		System.out.println("palindrome");
		else
		System.out.print("not");
	}
}
