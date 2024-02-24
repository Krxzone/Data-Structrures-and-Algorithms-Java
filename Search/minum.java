import java.util.Arrays;

public class minum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 8};
        System.out.println(min(arr));
    }

    static int min(int[] f) {
        // Sort the array
        Arrays.sort(f);
         // The minimum value is now at index 0
        return f[0];
    }
}
