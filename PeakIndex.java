// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0, 1, 10, 5, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while (s < e){
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m+1]){
                // you're in decreasing part of array
                // this may be ans, but look at the left
                e = m;
            } else {
                s = m+1;
            }
        }
        // in the end, start == end == largest number in the array
        return s;
    }
}
