package leetcodeTasks;

public class FindIndexOfOccurrenceString {
    public static void main(String[] args) {
        int i = strStr("leetcode", "leeto");
        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {
        int start = 0;
        int end = needle.length();
        if(haystack.length()==1 && haystack.charAt(0)==needle.charAt(0)) return 0;
        if (needle.length()==1 && haystack.contains(needle)) return haystack.indexOf(needle.charAt(0));
        if (needle.length() > haystack.length()) return -1;
        while (start < haystack.length() && end<=haystack.length()) {
            String substring = haystack.substring(start, end);
            System.out.println(substring);
            if (haystack.substring(start,end).equals(needle)){
                return start;
            }
            else {
                start++;
                end++;
            }
        }
        return -1;

//        for (int i = 0; i < haystack.length(); i++) {
//            if (haystack.charAt(i) == needle.charAt(test)) {
//                if (test == needle.length()-1) {
//                    return i-test;
//                }
//                test++;
//            }
//            else {
//                test = 0;
//
//            }
//        }
//        return -1;
//        return haystack.indexOf(needle);
    }
}
