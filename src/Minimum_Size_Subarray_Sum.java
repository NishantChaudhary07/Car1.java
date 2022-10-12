public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        minSubArrayLen(15,a);
    }
    public static void minSubArrayLen(int tar, int[] arr) {
        int si=0;
        int sum=0;
        int le=arr.length-1;
        int l=Integer.MAX_VALUE;
//        System.out.println(l+"htht");
        for (int end =0;end<arr.length;end++){
            sum+=arr[end];
            while (sum>=tar){
                l=Math.min(l,end-si+1);
                sum-=arr[si];
                si++;

            }
        }
        if (l==Integer.MAX_VALUE){
            System.out.println(0);
        }

        System.out.println(l+" "+le);
    }
}
