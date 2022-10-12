public class Bitwise_XOR_of_All_Pairings {
    public static void main(String[] args) {
        int n1[]={2,1,3};
        int n2[]={10,2,5,0};
        System.out.println(xorAllNums(n1,n2));
    }
    public static int xorAllNums(int[] nums1, int[] nums2) {
    int a=(nums2.length%2)==0?0:xor(nums1);
    int b=(nums1.length%2)==0?0:xor(nums2);
    return a^b;
    }
    public static  int xor(int [] num){
        int re=0;
        for (int i: num) {
            re^=i;
        }
        return re;
    }
}
