// https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/

public class PositionInInfiniteArray {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 7, 12, 45, 356, 653, 999, 4356, 6789};
        int target = 45;
        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end+1; // It is the new start
            // Double the box size: newEnd = previousEnd + (sizeOfBox * 2)
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BS(arr, target, start, end);
    }

    static int BS(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid+1;
            } else if (target < arr[mid]){
                end = mid-1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
