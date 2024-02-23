import java.util.*;
public class fib
{
    public static void main(String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=a+b;             //nth fibo no.
        //System.out.println(a +"\n" +b+"\n"+c);
        /*for (int i=2;i<n;i++){
        a=b;
        b=c;
        c=a+b;
        }
        System.out.println(c);*/
        //The other way out
        int g=2;
        while (g<n) 
        {
            a=b;
            b=c;
            c=a+b;
            g++;
        }
        System.out.println(c);
    }
}