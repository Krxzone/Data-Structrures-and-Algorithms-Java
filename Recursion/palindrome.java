public class palindrome {
    public static void main(String[] args) {
        String h="NAMAN";
        System.out.println(pal(h,0,h.length()-1));
    }
    static boolean pal(String h,int s,int e)
    {
        if (s==e)
        {
            return true;
        }
        if (h.charAt(s)!=h.charAt(e))
        {
            return false;
        }
        if (s<e+1)
        return (pal(h,s+1,e-1));
        return true;
    }
}
