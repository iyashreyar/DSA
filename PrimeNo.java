public class PrimeNo {
    public static void main(String[] args) {
        boolean ans = prime(17);
        System.out.println(ans);
    }

    static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        
        // If the loop finishes without finding a factor, 
        // c * c will be greater than n, returning true.
        return c * c > n; 
    }
}