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
class Pattern3{
    public static void pattern3(int n){
        int row=1;
        int start=1;
        while(row<=n)
        {
            int col=1;
            while(col<=star)
            {
                System.out.print("*");
                col++;
            }
            System.out.println();
            star++;
            row++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        pattern3(n);
    }
}
















