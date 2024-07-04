/******************************************************************************

write a program to create multiple constuctors with the same funtionaities.

*******************************************************************************/
import java.util.*;
class fun{
    fun(int a){
        System.out.println(a%10);
    }
    fun(int a,int b){
        System.out.println(a-b);
    }
    fun(int a,int b,int c){
        System.out.println(a<b?a<c?a:c:b<c?b:c);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fun f = new fun(sc.nextInt());
		new fun(sc.nextInt(),sc.nextInt());
		new fun(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
}
