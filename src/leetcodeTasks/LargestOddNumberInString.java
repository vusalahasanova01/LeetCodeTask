package leetcodeTasks;


public class LargestOddNumberInString {
    public static void main(String[] args) {
        String a = "52";
        String s = largestOddNumber(a);
        System.out.println(s);
    }


    public static String largestOddNumber(String num) {
        Character lastNum = null;
        int i = num.length();
        while (i > 0) {
            String test = num.substring(0, i);
            if (test.length() > 1) {
                lastNum = test.charAt(test.length() - 1);
            } else {
                lastNum = test.charAt(0);
            }
            if (lastNum == '1'
                    || lastNum == '3'
                    || lastNum == '5'
                    || lastNum == '7'
                    || lastNum == '9'
            ) {

                return test;
            }

            i--;
        }
        return "";
    }
}


//TODO TIME LIMIT EXCEED SOLUTION

//        HashMap<String, Integer> result = new HashMap<>();
//        Character lastNum = null;
//        for (int i = 0; i < num.length(); i++) {
//            String test = num.substring(0, num.length() - i);
//            if (test.length() > 1) {
//                lastNum = test.charAt(test.length() - 1);
//            } else {
//                lastNum = test.charAt(0);
//            }
//            if (lastNum == '1'
//                    || lastNum == '3'
//                    || lastNum == '5'
//                    || lastNum == '7'
//                    || lastNum == '9'
//            ) {
//                result.put(test, test.length());
//            }
//        }
//
//
//        Integer compare = null;
//        String answer = "";
//        for (Map.Entry<String, Integer> entry : result.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();
//            if (compare == null || value > compare) {
//                compare = value;
//                answer = key;
//
//            }
//
//        }
//        return answer;
