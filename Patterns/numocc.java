import java.util.*;
public class numocc 
{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        long k=x.nextLong();
        int c=0;
        while (k>0)
        {
            if (k%10==7)
            {
                c+=1;
            }
            k=k/10;
        }
        System.out.println(c);
    }
}
