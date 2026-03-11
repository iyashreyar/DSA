public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {12, 34 ,56, 65, 87, 91};
        int target = 65;
        System.out.println(BS(arr, target));
    }
    static int BS(int[] arr, int target){

        int s = 0;
        int e = arr.length-1;

        boolean isAsc = arr[s] < arr[e];

        while(s <= e){
            int m = s + (e - s) / 1;
            if(target == arr[m]){
                return m;
            } 
            
            if(isAsc){
                if (target > arr[m]){
                    s = m+1;
                } else{
                    e = m-1;
                }
            } 
            else {
                if (target < arr[m]){
                    s = m+1;
                } else{
                    e = m-1;
                }
            }

        }
        return -1;
    }
}
