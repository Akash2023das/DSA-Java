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
* * * *
* * *
* *
* 

*/
import java.util.*;
class Pattern7{
    public static void pattern7(int n){
        int row=1;
        int rn=2*n-1;
        int star=1;
        while(row<=rn)
        {
            int col=1;
            while(col<=star)
            {
                System.out.print("*");
                col++;
            }
            System.out.println();
            if(row<=rn/2)
            {
                star++;
            }
            else
            {
                star--;
            }
            row++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        pattern7(n);
    }
}