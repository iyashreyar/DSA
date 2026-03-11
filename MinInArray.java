public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 8};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int Min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < Min){
                Min = arr[i];
            }
        }
        return Min;
    }
}
