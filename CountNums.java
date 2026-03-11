// QUE: Find total number of occurences of a digit in a number 

public class CountNums {
    public static void main(String[] args) {
        int count = 0;
        int num = 1237325;
        int i = 8;
        while(num > 0){
            int rem = num%10;
            if(rem == i){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
