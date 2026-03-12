public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,14,56,89,99};
        int target = 89;
        System.out.println(BS(arr, target));
    }
    static int BS(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

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
