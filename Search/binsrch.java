public class binsrch {
    public static void main(String[] args) {
        int[] d={1,2,3,4,5,6,7,8,9,10};
        int f=9;
        System.out.println(b_search(d,f));
    }
    static int b_search(int[] g,int t)
    {
        int l=0;
        int u=(g.length)-1;
        while (u>=l){
            int mid= l+ (u-l)/2;
            if (g[mid]<t)
            {
                l=mid+1;
            }
            else if (t<g[mid])
            {
                u=mid-1;
            }
            else 
            return mid; 
        }
        return -1;
        
        
    }
}
