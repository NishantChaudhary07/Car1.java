public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
    int num1[]={1,2};
    int num2[]={3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newarr[] = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, newarr, 0, nums1.length);
        System.arraycopy(nums2, 0, newarr, nums1.length, nums2.length);
        bsort(newarr);
        int start = 0;
        int end = newarr.length - 1;

        while (start <= end) {
            if (newarr.length % 2 != 0) {
                if (newarr[start] == newarr[end]) {
                    return newarr[start];
                }

            }
//            return (newarr[start] + newarr[end]) / 2;
            start++;
            end--;
        }
        return (double) (newarr[start] + newarr[end]) / 2;

    }

    public static void bsort(int narr[]){
        for (int i=0;i<narr.length;i++){
            for (int j=1;j<narr.length-i;j++){
                if (narr[j]<narr[j-1]){
                    int t=narr[j-1];
                    narr[j-1]=narr[j];
                    narr[j]=t;
                }
            }
        }
    }
}
