import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 16;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length; // be cautious, matrix maybe empty

        if(rows == 1){
            return BS(arr, target, 0, 0, cols-1);
        }

        // Run loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd - rStart) / 2;
            if(target == arr[mid][cMid]){
                return new int[]{mid, cMid};
            } else if(target > arr[mid][cMid]){
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we've two rows remaining
        // Check whether the target is in the col of 2 rows
        if (target == arr[rStart][cMid]){
            return new int[]{rStart, cMid};
        }
        if (target == arr[rStart+1][cMid]){
            return new int[]{rStart+1, cMid};
        }
        // Search in 1st part (Top Left)
        if (cMid > 0 && target <= arr[rStart][cMid - 1]) {
            return BS(arr, target, rStart, 0, cMid - 1);
        }
        // Search in 2nd part (Top Right)
        if (cMid < cols - 1 && target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return BS(arr, target, rStart, cMid + 1, cols - 1);
        }
        // Search in 3rd part (Bottom Left)
        if (cMid > 0 && target <= arr[rStart + 1][cMid - 1]) {
            return BS(arr, target, rStart + 1, 0, cMid - 1);
        }
        // Search in 4th part (Bottom Right)
        else{
            return BS(arr, target, rStart + 1, cMid + 1, cols - 1);
        }
    }

    static int[] BS(int[][] arr, int target, int row, int cStart, int cEnd){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(target == arr[row][mid]){
                return new int[]{row, mid};
            } else if(target > arr[row][mid]){
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
