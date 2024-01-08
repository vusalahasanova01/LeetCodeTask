package leetcodeTasks;


public class NumberOfSegmentsInAsegments {
    public static void main(String[] args) {
        int i = countSegments(", , , ,        a, eaefa");
        System.out.println(i);

    }


    public static int countSegments(String s) {
        //TODO SOLUTION 3 WITHOUT USING ANY LIBRARY
        char[] charArray = s.toCharArray();
        int count = 0;
        boolean isCount = true;
        for (int i = 0; i < charArray.length; i++) {
            if ((Character.isLetter(charArray[i]) || charArray[i] != ' ') && isCount) {
                count++;
                isCount = false;
            } else if (!Character.isLetter(charArray[i]) && charArray[i] == ' ') {
                isCount = true;
            } else {
                continue;
            }
        }
        return count;

        //TODO WAY 1
//        String trim = s.trim();
//        if (trim==null || trim.isEmpty()) return 0;
//        String[] split = trim.split("\s+");
//        return split.length;

        //TODO WAY 2
//        StringTokenizer st = new StringTokenizer(s," ");
//        int c =0;
//        while(st.hasMoreTokens())
//        {
//            c++;
//            st.nextToken();
//        }
//
//        return c;
    }
}
