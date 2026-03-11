public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {923, 345, 75, 43, 54, 653};
        int Max = maxRange(arr, 0, 1);
        System.out.println(Max);
    }
    static int max(int[] nums){
        if(nums == null){
            return -1;
        }
        int Max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(Max < nums[i]){
                Max = nums[i];
            }
        }
        return Max;
    }
    static int maxRange(int[] nums, int start, int end){
        if(nums.length == 0){
            return -1;
        }
        if (end < start){
            return -1;
        }
        int Max = nums[start];
        for (int i = start+1; i <= end; i++) {
            if(Max < nums[i]){
                Max = nums[i];
            }
        }
        return Max;
    }
}
