import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenFibonacciSum {

    private static List<Integer> pairs = new ArrayList<Integer>();
    private static List<Integer> checked = new ArrayList<Integer>();
    public static int sum = 0;
    public static int next;

    public static int EvenFibonacciSum(int first, int second, int n) {
        pairs.add(first);
        pairs.add(second);
        System.out.println("Pairs " + pairs);
        System.out.println("Checked " + checked);
        for (int number : pairs) {
            if (!checked.contains(number)) {
                checked.add(number);
                System.out.println(number);
                if (number < n) {
                    if (number % 2 == 0) {
                        sum = sum + number;
                    }
                    if (number == pairs.get(pairs.size()-1)) {
                        next = first + second;
                        System.out.println("Next " + next);
                        pairs.clear();
                        EvenFibonacciSum(second, next, n);
                    }
                }
            }
        }
        System.out.println("Sum " + sum);
        return sum;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input the number of times,and the test cases");

        EvenFibonacciSum(1, 2, 100);
    }
}
