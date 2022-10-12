public class Maximum_Average_Subarray {
    public static void main(String[] args) {
int ar[]={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(ar,4));
    }
    public static double findMaxAverage(int[] ar, int k) {
      double sum=0.0;
      for (int i=0;i<k;i++){
          sum+=ar[i];
      }
      double max= sum/k;
      for (int i=k;i<ar.length;i++){
          sum+=ar[i];
          sum-=ar[i-k];
          max=Math.max((sum/k),max);
      }
      return max;
    }
}
