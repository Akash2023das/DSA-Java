/*
input
------
n = 5

output
-------

*               *
* *           * *   
* * *       * * *
* * * *   * * * *
* * * * * * * * *

*/
import java.util.*;

class Pattern10
{
    public static void pattern10(int n){
        int row=1;
        int star=1;
        int space=2*n-3;
        while(row<=n)
        {
            for(int col=1; col<=star; col++)
            {
                System.out.print("*");
            }
            for(int csp=1; csp<=space; csp++)
            {
                System.out.print(" ");
            }
            int cst=1;
            if(row==n)
            {
                cst=2;
            }
            for(; cst<=star; cst++)
            {
                System.out.print("*");
            }
            System.out.println();
            star++;
            space=space-2;
            row++;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        pattern10(n);
    }
}















