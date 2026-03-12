// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            BS(nums, target, 0, nums.length-1);
        }
        if (BS(nums, target, 0, pivot) != -1){
            return BS(nums, target, 0, pivot);
        }
        return BS(nums, target, pivot+1, nums.length-1);
    }
    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while (s <= e){
            int m = s + (e - s) / 2;
            if (m < e && arr[m] > arr[m+1]){
                return m;
            } 
            if (m > s && arr[m] < arr[m-1]){
                return m - 1;
            }
            if (arr[m] <= arr[s]){
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }
    static int BS(int[] arr, int target, int start, int end){
        int s = start;
        int e = end;

        while(s <= e){
            int m = s + (e - s) / 2;
            if(target > arr[m]){
                s = m+1;
            } else if (target < arr[m]){
                e = m-1;
            } else{
                return m;
            }
        }
        return -1;
    }
}
