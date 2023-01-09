/*
input
------
n = 5

output
-------
        *
      * *
    * * *
  * * * *
* * * * *
*/

import java.util.*;
class Pattern5{
    public static void pattern5(int n){
        int row=1;
        int star=1;
        int space=n-1;
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
            System.out.println();
            space--;
            star++;
            row++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        pattern5(n);
    }
}
















