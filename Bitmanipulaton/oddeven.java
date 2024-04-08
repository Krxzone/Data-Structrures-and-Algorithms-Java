import java.util.*;
public class oddeven
{    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
        System.out.println(isodd(g));
    sc.close();
    }
    static boolean isodd(int x)
    {
        return (x&1)==1;  //kyuki kisi bhi number ke last bit agar one hai to vo odd hai 
        //or kisi number ka 1 ke sath and krke agar 1 aata hai to matlb vo odd hai
    }

    
}
