/******************************************************************************

write a program to get 3 students name and marks to calculate the total and average 
of the students and print the details of the students who passed(>=35) in all subjects.

*******************************************************************************/
import java.util.*;
class pass{
    void pass(int a[][],String s[],int n){
        for(int i=0;i<n;i++){
            int flag=1;
            for(int j=0;j<n;j++){
                if(!(a[i][j]>=35)){
                    flag=0;break;
                }
            }
            if(flag==1)
            System.out.println("passed students " + s[i]);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many subjects?");
		int n=sc.nextInt();
		String s[]=new String[n];
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++){
		    System.out.println("student name:");
		    s[i]=sc.next();
		    System.out.println("enter the marks for this student one by one:");
		    for(int j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		pass p=new pass();
		p.pass(a,s,n);
	}
}
