import java.util.*;
public class BubbleSort
{
    public static void main(String[] args) {
        int[] arr={5,2,3,2,6};
        System.out.println(Arrays.toString(bsort(arr)));
    }
    static int[] bsort(int[] x)
    {
        for (int i=0;i<x.length;i++)
        {
            for (int j=1;j<x.length-i;j++)
            {
                if (x[j-1]>x[j])
                {
                    int temp=x[j-1];
                    x[j-1]=x[j];
                    x[j]=temp;
                }
            }
        }
        return x;
    }
}