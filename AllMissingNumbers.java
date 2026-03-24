// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers{
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(i < nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        // Find missing numbers and add them to List
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                list.add(index+1);
            }
        }
        return list;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}