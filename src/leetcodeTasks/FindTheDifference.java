package leetcodeTasks;

import java.util.HashMap;

public class FindTheDifference {
    public static void main(String[] args) {
        char theDifference = findTheDifference("a", "aa");
        System.out.println(theDifference);
    }

//    public static void main(String[] args) {

    public static  char findTheDifference(String s, String t) {
//        String s = "abcd";
        HashMap<Character, Integer> first = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (first.containsKey(c)) {
                Integer i1 = first.get(c);
                int result = i1 + 1;
                first.put(c, result);
            } else {
                first.put(c, 1);
            }

        }

//        String t = "abcde";
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (first.containsKey(c)) {
                Integer i1 = first.get(c);
                if (i1 > 1) {
                    int result = i1 - 1;
                    first.put(c, result);
                } else {
                    first.remove(c);
                }
            } else {
                return c;
            }
        }
        return ' ';

    }
}
