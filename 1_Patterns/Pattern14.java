/*
input
------
n = 5

output
------
           1
         1 2 1 
       1 2 3 2 1
     1 2 3 4 3 2 1
   1 2 3 4 5 4 3 2 1
*/
import java.util.*;
class Pattern14{
    public static void pattern14(int n)
    {
        int row=1;
        int space=n-1;
        int star=1;
        int val=1;
        while(row<=n)
        {
            val=1;
            for(int col=1; col<=space; col++)
            {
                System.out.print(" "+"\t");
            }
            for(int cst=1; cst<=star; cst++)
            {
                System.out.print(val+"\t");
                if(cst<=star/2)
                {
                    val++;
                }
                else
                {
                    val--;
                }
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
        pattern14(n);
    }
}