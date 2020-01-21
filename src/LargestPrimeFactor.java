import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

    public static int largestPrimeFactor;

    public static int LargestPrime(int number) {
        for (int factor = 2; factor < number; factor++) {
            if (number % factor == 0) {
//                for (int x = 2; x < factor; x++)
                int x = 2;
                while (x < factor){
                    if (factor % x == 0) {
                        System.out.println("Not Prime " + x);
                        x++;
                    }else {
                        System.out.println("Prime " + x);
                        x++;
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
