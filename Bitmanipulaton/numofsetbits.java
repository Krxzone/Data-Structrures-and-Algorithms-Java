import java.util.*;
public class numofsetbits
{
    public static void main(String[] args) {
        int n=45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(sbts(n));
    }
    static int sbts(int n)
    {
        int c=0;
        while (n>0)
        {
            c++;
            n=n & (n-1) ;
        }
        return c;
    }
}