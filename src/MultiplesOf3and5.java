public class MultiplesOf3and5 {

    private static int sum = 0;

    public static int multiplesOf3and5(int param) {
        for (int x = 0; x < param; x++) {
            if (x % 3 == 0 || x % 5 == 0) {
                System.out.println(x);
                sum = sum + x;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String args[]) {
        multiplesOf3and5(1000);
    }
}
