/******************************************************************************

write a program to create a 'diaplay' method with different funtionalities in both
superclass and subclass and access them with a single object.

*******************************************************************************/
import java.util.*;
class parent{
    parent(int a){
        System.out.println(a%10);
    }
    parent(int a,int b){
        System.out.println(a-b);
    }
    parent(int a,int b,int c){
        System.out.println(a<b?a<c?a:c:b<c?b:c);
    }
}
class child extends parent{
    void child(int a){
        System.out.println(a*a);
    }
    void child(int a,int b){
        System.out.println(a+b);
    }
    void child(int a,int b,int c){
        System.out.println(a>b?a>c?a:c:b>c?b:c);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		child c = new child(sc.nextInt());
		new child(sc.nextInt(),sc.nextInt());
		new child(sc.nextInt(),sc.nextInt(),sc.nextInt());
	}
}
