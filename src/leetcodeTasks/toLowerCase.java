package leetcodeTasks;

public class toLowerCase {
    public String toLowerCase(String s) {

        StringBuilder result = new StringBuilder();
        for (char x : s.toCharArray()) {
            if (x >= 'A' || x <= 'Z') {
                x = (char) ((int) x + 32);
            }
            result.append(x);

        }
        return result.toString();
    }
}
