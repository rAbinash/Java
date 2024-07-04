/******************************************************************************

write a program to create methods with multiple classes.

*******************************************************************************/
import java.util.*;
class fun{
    void sqr(int a){
        System.out.println(a*a);
    }
    void pro(int a,int b){
        System.out.println(a*b);
    }
    void big(int a,int b,int c){
        System.out.println(a>b?a>c?a:c:b>c?b:c);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fun f = new fun();
		f.sqr(sc.nextInt());
		f.pro(sc.nextInt(),sc.nextInt());
		f.big(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
}
