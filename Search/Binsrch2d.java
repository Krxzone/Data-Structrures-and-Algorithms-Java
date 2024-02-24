import java.util.Arrays;

public class Binsrch2d {
    public static void main(String[] args) {
        int[][] ar={{1,2,3},{4,5,6},{7,8,9}};
        int h=6;
        System.out.println(Arrays.toString(srch(ar,h)));
    }
    static int[] srch(int[][] ar,int h)
    {
        int i=0;
        int c=(ar.length)-1;
        while(i<ar.length && c>=0)
        {
            if(ar[i][c]==h)
            {
                return new int[]{i+1,c+1};
            }
            if (h>ar[i][0])
            {
                i++;
            }
            if (h<ar[i][(ar[i].length)-1])
            {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
