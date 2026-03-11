public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {923, 345, 75, 43, 54, 653};
        int Max = max(arr);
        System.out.println(Max);
    }
    static int max(int[] nums){
        int Max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(Max < nums[i]){
                Max = nums[i];
            }
        }
        return Max;
    }
}
