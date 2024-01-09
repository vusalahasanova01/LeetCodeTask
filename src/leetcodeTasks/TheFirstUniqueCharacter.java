package leetcodeTasks;

import java.util.Hashtable;
import java.util.Map;

public class TheFirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "dabbcb";
        int i = firstUniqChar(s);
        System.out.println(i);

    }

    public static int firstUniqChar(String s) {
        Hashtable<Character, Integer> countOfChar = new Hashtable<>();
        for (char c : s.toCharArray()) {
            if (!countOfChar.containsKey(c)) {
                countOfChar.put(c, 1);
            } else {
                Integer count = countOfChar.get(c);
                count = count + 1;
                countOfChar.put(c, count);
            }
        }

        int answer = -1;
        for (Map.Entry<Character, Integer> entry : countOfChar.entrySet()) {
            Character key = entry.getKey();
            Integer result = entry.getValue();
            if (result == 1 && (s.indexOf(key) < answer || answer == -1)) {
                answer = s.indexOf(key);
            }

        }
        return answer;
    }
}
