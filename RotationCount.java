// https://www.geeksforgeeks.org/dsa/find-rotation-count-rotated-sorted-array/

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {2,2,2,9,2};
        System.out.println(count(arr));
    }
    static int count(int[] arr){
        int rotationCount = pivotIndexWithDuplicates(arr)+1;
        return rotationCount;
    }

    static int pivotIndexWithDuplicates(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int m = s + (e - s) / 2;
            if (m < e && arr[m] > arr[m+1]){
                return m;
            }
            if (m > s && arr[m] < arr[m-1]){
                return m - 1;
            }
            // 1. Handle duplicates: skip start and end
            if (arr[s] == arr[m] && arr[m] == arr[e]){
                if(s < e && arr[s] > arr[s+1]){
                    return s;
                }
                s = s + 1;
                if(arr[e] < arr[e-1]){
                    return e-1;
                }
                e = e - 1;
            } 
            // 2. Left side is sorted, pivot is on the right
            else if (arr[s] < arr[m] || (arr[s] == arr[m] && arr[m] > arr[e])) {
                s = m + 1;
            } 
            // 3. Right side is sorted, pivot is on the left
            else {
                e = m - 1;
            }
        }
        return -1;
    }
}
