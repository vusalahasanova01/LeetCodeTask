package leetcodeTasks;

public class DetectCapital {
    public static void main(String[] args) {
        String word = "ffffffffffffffffffffF";
        boolean b = detectCapitalUse(word);
        System.out.println(b);
    }

    //65-90
    //97-122
    public static boolean detectCapitalUse(String word) {
        char[] charArray = word.toCharArray();
        int count1 = 0;
        int count2 = 0;
        if (word.toLowerCase().equals(word)) return true;
        if (word.toUpperCase().equals(word)) return true;
        for (int i = 0; i < charArray.length; i++) {
            char checkCapital = charArray[i];
            if ((checkCapital >= 60 && checkCapital <= 90)) {
                count1++;
            }
            if (checkCapital >= 97 && checkCapital <= 122) {
                count2++;
            }
        }
        System.out.println(count2);
        System.out.println(count1);
        if (count1 == word.length() || count2 == word.length()-1) {
            return true;
        }
        return false;

    }
}
