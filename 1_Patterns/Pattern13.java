/*
input
------
n = 5

output
------
           1
         2 3 4 
       5 6 7 8 9
   10 11 12 13 14 15 16
17 18 19 20 21 22 23 24 25

*/
import java.util.*;
class Pattern13{
    public static void pattern13(int n)
    {
        int row=1;
        int space=n-1;
        int star=1;
        int val=1;
        while(row<=n)
        {
            for(int col=1; col<=space; col++)
            {
                System.out.print(" "+"\t");
            }
            for(int cst=1; cst<=star; cst++)
            {
                System.out.print(val+"\t");
                val++;
            }
            System.out.println();
            space--;
            star+=2;
            row++;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        pattern13(n);
    }
}