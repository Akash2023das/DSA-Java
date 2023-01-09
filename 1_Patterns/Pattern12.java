/*
input
------
n = 5

output
------
        1
      2 2 2 
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5

*/
import java.util.*;
class Pattern12{
    public static void pattern12(int n)
    {
        int row=1;
        int space=n-1;
        int star=1;
        int val=1;
        while(row<=n)
        {
            for(int col=1; col<=space; col++)
            {
                System.out.print(" "+" ");
            }
            for(int cst=1; cst<=star; cst++)
            {
                System.out.print(val+" ");
            }
            System.out.println();
            space--;
            star+=2;
            val++;
            row++;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        pattern12(n);
    }
}