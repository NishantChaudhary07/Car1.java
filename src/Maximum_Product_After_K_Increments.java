public class Maximum_Product_After_K_Increments {
    public static void main(String[] args) {
int n[]={6,3,3,2};
int k=2;
        System.out.println(maximumProduct(n,k));
    }
    public static int maximumProduct(int[] nums, int k) {

     if (nums[0]==0){
         nums[0]=1;
     }

     int t=(nums[0]*k);



     int p=1;
     for (int i=1;i<nums.length;i++){
         p*=nums[i];
     }
     return p*t;
    }
}
