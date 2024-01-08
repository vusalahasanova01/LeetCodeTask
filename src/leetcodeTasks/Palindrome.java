package leetcodeTasks;

public class Palindrome {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(1321);
        System.out.println(palindrome);

    }

    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        int length = 0;
        if (number.length() % 2 == 0) {
            length = number.length() / 2;
        } else {
            length = number.length() / 2 + 1;
        }
        for (int i = 0; i < length; i++) {
            if (!(number.charAt(i) == number.charAt(number.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
