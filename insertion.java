import java.util.*;
public class insertion {
    public static void main(String[] args) {
        int[] arr={3,4,0,-5,4,1};
        System.out.println(Arrays.toString(insert(arr)));
    }
    static int[] insert(int[] arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if (arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else 
                {
                    break;
                }
            }
        }
        return arr;
    }
}
