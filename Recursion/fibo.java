public class fibo {
    public static void main(String[] args)
    {
        System.out.println(fibo(7));
    }
    static int fibo(int x)
    {
        if (x<2)
        {
            return x;
        }
        return fibo(x-1)+fibo(x-2) ; 
    }

}
