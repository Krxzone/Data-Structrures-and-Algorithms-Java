public class FindUnique {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,1,3,5,5,6,7,7};
        System.out.println(unq(arr));

    }
    static int unq(int[] x)
    {
        int u=0;
        for(int n:x)
        {
            u^=n;
        }
        return u;
    }
}
