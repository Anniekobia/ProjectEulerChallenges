import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    private static List<Integer> pairs = new ArrayList<Integer>();
    private static List<Integer> checked = new ArrayList<Integer>();
    public static int sum = 0;
    public static int next;

    public static int EvenFibonacciSum(int first, int second, int n) {
        pairs.add(first);
        pairs.add(second);
        for (int number : pairs) {
            if (!checked.contains(number)) {
                checked.add(number);
                if (number <= n) {
                    if (number % 2 == 0) {
                        sum = sum + number;
                    }
                    if (number == pairs.get(pairs.size() - 1)) {
                        next = first + second;
                        pairs.clear();
                        EvenFibonacciSum(second, next, n);
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        sum = EvenFibonacciSum(1, 2, 4000000);
        System.out.println("Sum: " + sum);
    }
}
