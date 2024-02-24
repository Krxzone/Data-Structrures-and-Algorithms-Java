public class OrderAgnosticBinsrch {
    public static void main(String[] args)
    {
        int[] arr={23,23,21,20,17,13,12,10,9,1};
        int t=10;
        if (arr[0]>arr[(arr.length)-1])
        {
            System.out.println(asc(arr,t));
        }
        if (arr[0]<arr[(arr.length)-1])
        {
            System.out.println(dsc(arr,t));
        }
       // else
        //System.out.println(asc(arr,t));
    }
    static int asc(int[] g,int t)
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
    static int dsc(int[] g,int t)
    {
        int l=0;
        int u=(g.length)-1;
        while (u>=l){
            int mid= l+ (u-l)/2;
            if (g[mid]<t)
            {
                u=mid-1;
            }
            else if (t<g[mid])
            {
                l=mid+1;
            }
            else 
            return mid; 
        }
        return -1;      
    }
}
