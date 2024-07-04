/******************************************************************************

write the program to replace all the particular words in the even position.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String a=sc.next(),v="";
	    String b=sc.next();int c=0;
	    for(String i:s.split(" "))
	    {
	        
	        if(i.equals(a))
	        {
	            c++;
	            if(c%2==0)
	                v+=b+" ";
	  
	            else
	                v+=i+" ";
	        }
	        else
	        v+=i+" ";
	    }
	     System.out.print(v);
    }
}

