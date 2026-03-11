import java.util.Arrays;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {2,6,3,8,1};
        swap(arr, 4, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
