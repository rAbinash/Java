/******************************************************************************

write the program to create an interface with the final value for 'PI' and calculate the 
Area for circle,cylinder and ellipse.

*******************************************************************************/
import java.util.*;

interface class formula
{
    public void PI();
    public void circle();
    public void cylinder();
    public void ellipse();
}
interface class answer implements formula
{
    void PI(){
        System.out.println("PI final value = "+ 22/7);
    }
    void circle(int r){
        System.out.println("Area of the circle = " + ((22/7)*(r*r)));
    }
        void cylinder(int r,int h){
        System.out.println("Area of the cylinder = " + ((2*(22/7)*r*h)+(2*(22/7)*(r*r))));
    }
        void ellipse(int a,int b){
        System.out.println("Area of the ellipse = " + ((22/7)*a*b));
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		answer s = new answer();
		s.PI();
		s.circle(sc.nextInt());
	    s.cylinder(sc.nextInt(),sc.nextInt());
	    		s.ellipse(sc.nextInt(),sc.nextInt());
	}
}