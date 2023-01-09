/*
input
------
n = 5

output
-------
       *
     * * *
   * * * * *
 * * * * * * *
   * * * * *
     * * * 
       *
*/
import java.util.*;
class Pattern9{
    public static void pattern9(int n)
    {
        int row=1;
        int rn=n/2;
        int space=n/2;
        int star=1;
        while(row<=n)
        {
            int col=1;
            while(col<=space)
            {
                System.out.print(" ");
                col++;
            }
            int cst=1;
            while(cst<=star)
            {
                System.out.print("*");
                cst++;
            }
            int csp=1;
            while(csp<=space)
            {
                System.out.print(" ");
                csp++;
            }
            System.out.println();
            if(row<=rn)
            {
                space--;
                star=star+2;
            }
            else
            {
                space++;
                star=star-2;
            }
            row++;
        }       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        pattern9(n);
    }
}