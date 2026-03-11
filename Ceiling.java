public class Ceiling{
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,15,18};
        int target = 8;
        System.out.println(ceiling(arr, target));
    }

    // Return the index of smallest number >= target
    static int ceiling(int[] arr, int target){
        
        int s = 0;
        int e = arr.length-1;

        //If the target element is greater than largest number in array
        if (target > arr[arr.length-1]){
            return -1;
        }
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
        return s;
    }
}