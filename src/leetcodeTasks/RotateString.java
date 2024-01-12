package leetcodeTasks;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        return s.concat(s).contains(goal) && s.length() == goal.length();
    }

    //TODO
    //SHORT EXPLANATION
    // FOR EXAMPLE ABCDE is given string
    // and cdeab is rotated string, how to solve it,if rotate string is contains s+s. abcde+abcde
    //abcdeabcde - cdeab is contains- return true, and must check s length and goal length if equals or not
}
