/******************************************************************************
 
 write a program to convert temperatures from celsius to fahrenheit.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner Sc = new Scanner(System.in);
	    float c = Sc.nextFloat();
		System.out.println("F="+(c*9/5)+32);
	}
}
