// https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        // Returning the number that occurs twice and the number that is missing in the form of an array.
        int duplicate = -1;
        int missing = -1;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                duplicate = arr[index];
                missing = index+1;
                return new int[]{duplicate, missing};
            }
        }
        return new int[]{duplicate, missing};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
