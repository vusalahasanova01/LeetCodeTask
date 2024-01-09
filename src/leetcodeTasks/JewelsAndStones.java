package leetcodeTasks;

import java.util.HashSet;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        int i = numJewelsInStones(jewels, stones);
        System.out.println(i);
    }
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> result = new HashSet<>();
        int count = 0;
        for (char c : jewels.toCharArray()) {
            result.add(c);
        }
        for (int i = 0; i < stones.length(); i++) {
            if (result.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;

    }
}
