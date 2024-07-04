/******************************************************************************

write a program to create to get students names and marks,another class to calculate
the total and average of the students.

*******************************************************************************/
import java.util.*;
class stu{
    void mark(int a[],int n,String s){
        int sum=0,avg=0,c=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            c++;
        }
        System.out.println(s+": TOTAL="+sum+" and AVERAGE="+sum/c);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[10];
		System.out.print("Student Name:");
		String s=sc.next();
		System.out.println("How many subject?");
		int n=sc.nextInt();
		System.out.println("Enter the all subject marks one by one:");
		for(int i=0;i<n;a[i++]=sc.nextInt());
		stu m = new stu();
		m.mark(a,n,s);
	}
}
