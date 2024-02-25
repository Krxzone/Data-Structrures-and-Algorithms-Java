import java.util.*;
public class prg1 {
 public static void main(String[] args) {
    rcs(1);
 }
static void rcs(int n)
{   
    if (n==5)
    {
        return ;
    }
    System.out.println(n);
    rcs(n+1);
}
}