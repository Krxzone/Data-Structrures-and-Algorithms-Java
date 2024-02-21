import java.util.*;
public class Selectionsort {
    public static void main(String[] args) {
    int[] x={7,8,5,9,3,22,8};
    System.out.println(Arrays.toString(bsrt(x)));
    }
    static int[] bsrt(int[] arr)
    {
        for (int i = 0; i < (arr.length)-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < (arr.length); j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        }
    return arr;
    }
}
