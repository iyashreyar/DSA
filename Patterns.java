public class Patterns{
    public static void main(String[] args) {
        pattern5(6);
    }
    static void pattern1(int n){
        /*

        *****
        *****
        *****
        *****
        *****
        *****

        */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        /*

        *
        **
        ***
        ****
        *****

        */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        /*

        *****
        ****
        ***
        **
        *
        
        */
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        /*
        
        1
        12
        123
        1234
        12345

        */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        /*

        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *

        */
        for (int i = 0; i < 2 * n; i++) {
            int totalColsInRow = i > n? 2 * n - i: i; 
            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
