/*
input
------
n = 5

output
-------
*
*
*
*
*
*/
import java.util.*;
public class Pattern1
{
    public static void pattern1(int n){
        int row=1;
        int star=1;
        while(row<=n)
        {
            int col=1;
            while(col<=star)
            {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        pattern1(n);        
    }
}