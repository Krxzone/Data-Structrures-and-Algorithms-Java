import java.util.*;
public class p1 {
    public static void main(String[] args) {
        /*pattern1(4);                
        pattern2(4);
        pattern3(4);
        pattern4(4);*/
        //pattern8(5);
        pattern31(7) ;
    }
    static void pattern1(int s)
    {
        for (int i=1;i<=s;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int s)
    {
        for (int i=1;i<=s;i++)
        {
            for (int j=1;j<=s;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int s)
    {
        for (int i=1;i<=s;i++)
        {
            for (int j=s;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int s)
    {
        for (int i=1;i<=s;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
        static void pattern5(int n) {
            for (int row = 0; row < 2 * n; row++) {
                int totalColsInRow = row > n ? 2 * n - row: row;
                for (int col = 0; col < totalColsInRow; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    static void pattern8(int n)
    {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    }



