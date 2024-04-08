public class Magicnum {
    public static void main(String[] args) {
       int n=6;
       int b=5;
       int ans=0;
       while(n>0)
       {
         int l=n & 1;
         n=n>>1;
         ans+=l*b;
         b=b*5;
       } 
       System.out.println(ans);
    }
}
