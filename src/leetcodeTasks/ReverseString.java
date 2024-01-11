package leetcodeTasks;

public class ReverseString {
    public void reverseString(char[] s) {
        int i = s.length / 2;
        // h e l l o               0 1 2 3 4
        for (int j = 0; j < i; j++) {
            char tem = s[j];
            s[j] = s[s.length - 1 - j];
            s[s.length - 1 - j] = tem;
        }


    }
}
