/******************************************************************************

write a function to find the power of the given numbers using  the static method. 

*******************************************************************************/

import java.util.*;
class math
{
    static int power(int a, int b)
    {
        int t=1;
        for(;b!=0;b--,t*=a);
        return t;
    }
}
class Main
{
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in);
    System.out.print(math.power(sc.nextInt(),sc.nextInt()));
	}
}
