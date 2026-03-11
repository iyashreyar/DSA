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

    static boolean even(int num) {
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return false;
        }
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count%2 == 0;
    }
}
