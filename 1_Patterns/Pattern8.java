/*
input
------
n = 5

output
-------
* * *  * * *
* *    * * *
*          * 

*          *
* *      * * 
* * *  * * *

*/
import java.util.*;
class Pattern8{
    public static void pattern8(int n){
        int row=1;
        int rn=n/2;
        int star=n/2;
        int space=1;
        while(row<=n)
        {
            int col=1;
            while(col<=star)
            {
                System.out.print("*");
                col++;
            }
            int csp=1;
            while(csp<=space)
            {
                System.out.print(" ");
                csp++;
            }
            int cst=1;
            while(cst<=star)
            {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            if(row<=rn)
            {
                star--;
                space+=2;
            }
            else
            {
                star++;
                space-=2;
            }
            row++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        pattern8(n);
    }
}