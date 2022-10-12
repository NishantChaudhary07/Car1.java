import java.util.HashSet;
import java.util.Set;

public class zero {
    public static void main(String[] args) {
int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for (int i=0;i< nums.length;i++){
            sum+=nums[i];
            if (sum>ans)
                ans=sum;

            if (sum<0)
                sum=0;
        }
        return ans;
    }

}
