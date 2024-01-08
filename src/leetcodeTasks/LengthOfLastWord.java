package leetcodeTasks;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        //TODO SOLUTION 1
        String trim = s.trim();
        int j = 0;
        for (int i = trim.length() - 1; i >= 0; i--) {
            char c = trim.charAt(i);
            if (trim.charAt(i) != ' ') {
                j++;
            } else {
                break;
            }
        }
        return j;
        //TODO SOLUTION 2
        //    String[] splitted = s.trim().split("\\s+");
        //    return splitted[splitted.length-1].length();
    }
}
