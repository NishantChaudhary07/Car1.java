public class Maximum_Sum_of_an_Hourglass {
    public static void main(String[] args) {

    }
    public static int maxSum(int[][] grid) {
        int max=Integer.MIN_VALUE;
        for (int i=1;i< grid.length-1;i++){
            for (int j=1;j<grid[0].length-1;j++){
                max=Math.max(max,sum(grid,i,j));
            }
        }
        return max;
    }

    public static int sum(int arr[][],int i,int j){
        return arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
    }
}
