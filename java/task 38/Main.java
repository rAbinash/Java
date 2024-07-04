/******************************************************************************

write a program to find the excel ColumnName for the given ColumnNumber.

*******************************************************************************/
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cno = sc.nextInt();
        String cn = ColumnName(cno);
        System.out.println(cn);
    }

    public static String ColumnName(int cno) {
        StringBuilder cna = new StringBuilder();

        while (cno > 0) {
            int remainder = (cno - 1) % 26;
            char charToAdd = (char) ('A' + remainder);
            cna.insert(0, charToAdd);
            cno = (cno - 1) / 26;
        }

        return cna.toString();
    }
}