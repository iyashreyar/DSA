// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 22, 63, 7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        return Digits2(num) % 2 == 0;
    }

    static int Digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)+1);
    }

    // static int Digits(int num) {
        // if(num < 0){
        //     num = num * -1;
        // }
    //     if(num == 0){
    //         return 1;
    //     }
    //     int Digits = 0;
    //     while(num > 0){
    //         Digits++;
    //         num /= 10;
    //     }
    //     return Digits;
    // }
}
