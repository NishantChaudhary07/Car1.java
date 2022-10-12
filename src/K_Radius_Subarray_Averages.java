import java.util.Arrays;
public class K_Radius_Subarray_Averages {
    public static void main(String[] args) {
        int n[]={1,2,3,7,5};
        int k=12;
        System.out.println(getAverages(n,k));

    }
    public static int[] getAverages(int[] nums, int k) {
        int ans[]=new int[nums.length];

        Arrays.fill(ans,-1);

        if (k==0)
            return nums;

        if (nums.length<=(2*k))
            return ans;


        long sum=0;

        for (int i=0;i<=(2*k);i++){
            sum+=nums[i];
        }
        ans[k]=(int)Math.floor(sum/(2*k+1));

        for (int i=k+1;i<nums.length-k;i++){
            sum+=nums[i+k];
            sum-=nums[i-k-1];

            ans[i]=(int)Math.floor(sum/(2*k)+1);
        }
        return ans;
    }
}
