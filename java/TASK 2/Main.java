/******************************************************************************

write a programm to get a string and a number(n) through the command line and print the sting "n" number of lines.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int n = Integer.parseInt(args[1]);
	    while(n-->0){
		System.out.println(args[0]+" ");
		
	}
	}
}
