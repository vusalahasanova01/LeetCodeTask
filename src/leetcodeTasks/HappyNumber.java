package leetcodeTasks;

public class HappyNumber {
    public boolean isHappy(int n) {
        int j = 0;
        while (j++ < 10) {
            int result = 0;
            while (n != 0) {
                int i = n % 10;
                result = i * i + result;
                n = n / 10;
            }
            if (result == 1) {
                return true;
            }
            n = result;
        }
        return false;
    }
}
