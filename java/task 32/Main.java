/******************************************************************************

write a program to find whether the given number is the perfect square or not
using constructor and this keyword.

*******************************************************************************/
import java.util.*;
class Main
{
    void demo(int n){
        int flag=0;
    for(int i=2;i<=n/2;i++){
        if(i*i==n){
        flag=1;
        break;
    }
    }
    System.out.print(flag==1?"perfect square":"not");
}


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        m.demo(sc.nextInt());

	}

}
