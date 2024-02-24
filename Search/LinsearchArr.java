/**
 * LinsearchArr
 */
public class LinsearchArr {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,9};
        int g=srch(arr,7);
        String h="abcdefghijklnopqrstuvwxyz";
        char c='c';
        boolean d=srch2(h,c);
        System.out.println(d);
        System.out.println(g);
    }
    static int srch(int[] ar,int t)
    {
        if (ar.length==0)
        {
            return -1;
        }
        for (int i=0;i<ar.length;i++)
        {
            if(ar[i]==t)
            {
                return i;
            }
        }
        return -1;
    }
    static boolean srch2(String d,char h)
    {
        if (d.length()==0)
        {
            return false;
        }
        /*if( d.contains(h))
        {
            System.out.println("Found at index : "+d.indexOf(h));
            return true;
        }*/
        for (char i :d.toCharArray())
        {
            if (i==h)
            {
                return true;
            }
        }
        return false;
    }
}