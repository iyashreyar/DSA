// https://leetcode.com/problems/missing-number/description/

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 0};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        // Search for the missing index
        for (int index = 0; index < nums.length; index++) {
            if(index != nums[index]){
                return index;
            }
        }
        // Case 2:
        return nums.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
