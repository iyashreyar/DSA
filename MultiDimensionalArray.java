import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // INPUT
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //OUTPUT
        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println();
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        // }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
