public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,15,18};
        int target = 8;
        System.out.println(floor(arr, target));
    }

    // Return the index : Greatest number <= target
    static int floor(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        if (arr.length == 0){
            return -1;
        }
        while(s <= e){
            int m = s + (e - s) / 2;
            if(target == arr[m]){
                return m;
            } else if (target > arr[m]){
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return e;
    }
}
