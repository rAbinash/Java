/******************************************************************************

write a program to create class with following.
public methods(getName(),setName(),private members(SNAME) and Object(obj1).

*******************************************************************************/
import java.util.*;
private class hello
{
    private String SNAME;
    void setName(String SNAME)
    {
        this.name = SNAME;
    }
    void getName()
    {
        System.out.print("Welcome "+SNAME);
    }
}
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		hello Object1 = new hello();
		Object1.setName(sc.next());
		Object1.getName();
	}
}
