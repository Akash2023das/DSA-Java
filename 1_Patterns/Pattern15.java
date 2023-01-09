/*
input
------
n = 5

output
-------

1
2 * 2
3 * 3 * 3
4 * 4 * 4 * 4
5 * 5 * 5 * 5 * 5
4 * 4 * 4 * 4
3 * 3 * 3
2 * 2
1

*/
import java.util.*;
class Pattern15{
    public static void pattern15(int n)
    {
        int row=1;
        int rn=2*n-1;
        int star=1;
        int val=1;
        while(row<=rn)
        {
            for(int col=1; col<=star; col++)
            {
                if(col%2==0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(val);
                }
                
            }
            System.out.println();
            if(row<=rn/2)
            {
               star= star+2;
               val++;
            }
            else
            {
                star= star-2;
                val--;
            }
            //val++;
            row++;
        }       
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        pattern15(n);
    }
}