/* write a program if you give 2 integer it will add or one int and one string it will concat. */
package add;
public class Add
{
public void AddElements(String x,String y)
{
try{
   int a =Integer.parseInt(x);
   int b =Integer.parseInt(y);
System.out.println(a+b);
}
catch(Exception e){
System.out.print(x+y);
}
}
}