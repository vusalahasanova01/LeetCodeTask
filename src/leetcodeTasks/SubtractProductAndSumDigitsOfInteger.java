package leetcodeTasks;

public class SubtractProductAndSumDigitsOfInteger {
    public static void main(String[] args) {
        int n = 234;
        int result = subtractProductAndSum(n);
        System.out.println(result);
    }

    public static int subtractProductAndSum(int n) {
        int subtract = 1;
        int sum = 0;
        while (n > 0) {
            int c = n % 10;
            subtract = subtract * c;
            sum = sum + c;
            n = n / 10;
        }
        return subtract - sum;

    }
}
