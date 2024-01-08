package leetcodeTasks;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
//
//    String[] splitted = s.trim().split("\\s+");
//    StringBuilder str = new StringBuilder();
//        for(int i = 0; i < splitted.length; i++){
//        str.append(splitted[splitted.length-i-1]);
//        if(i!=splitted.length-1){
//            str.append(" ");
//        }
//    }
//        return str.toString();

}


