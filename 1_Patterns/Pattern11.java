/*
input
------
n = 5

output
------
        1
      1 1 1 
    1 1 1 1 1
  1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1

*/
import java.util.*;
class Pattern11{
    public static void pattern11(int n)
    {
        int row=1;
        int space=n-1;
        int star=1;
        int val=1;
        while(row<=n)
        {
            for(int col=1; col<=space; col++)
            {
                System.out.print(" ");
            }
            for(int cst=1; cst<=star; cst++)
            {
                System.out.print(val);
            }
            System.out.println();
            space--;
            star=star+2;
            row++;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        pattern11(n);
    }
}













