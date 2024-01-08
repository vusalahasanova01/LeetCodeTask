package leetcodeTasks;

import java.util.HashSet;

public class AddString {
    public static void main(String[] args) {
        String s = addStrings("123456", "345678");
        System.out.println(s);
    }

    public static String addStrings(String num1, String num2) {
        String result = num1.concat(num2);
        HashSet<Character> checkDublicate = new HashSet<>();
        for (int i = 0; i < result.length(); i++) {
            checkDublicate.add(result.charAt(i));
        }

        StringBuilder stringBuilder = new StringBuilder();
        checkDublicate.stream().forEach(a -> stringBuilder.append(a.toString()));

        return stringBuilder.toString();

    }
}
