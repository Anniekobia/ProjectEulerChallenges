import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    public static int largestPrimeFactor;

    public static int LargestPrime(int number) {
        for (int factor = 2; factor < number; factor++) {
            if (number % factor == 0) {
                for (int x = 2; x < factor; x++) {
                    if (factor % x == 0) {
                        System.out.println("Not Prime " + x);
                    }else {
                        System.out.println("Prime " + x);
                        largestPrimeFactor = factor;
                    }
                }
            }
        }
        System.out.println("Largest Prime Factor: " + largestPrimeFactor);
        return largestPrimeFactor;
    }

    public static void main(String[] args) {
        LargestPrime(13195);
    }
}
