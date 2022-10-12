public class Contains_Duplicate {
    public static void main(String[] args) {
        int arr[]={2,14,18,22,22};
        System.out.println(dup(arr));
    }
    public static boolean dup(int arr[]){
        for (int j=0;j< arr.length;j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j] == arr[i]) {
                    return true;

                }

            }
        }

        return false;
    }
}

//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        return set.size() != nums.length;
//    }