package leetcodeTasks;

public class RemoveDublicateFromSortedList {
    public String reverseWords(String s) {
        String[] splitted = s.trim().split("\\s+");
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < splitted.length; i++){
            str.append(splitted[splitted.length-i-1]);
            if(i!=splitted.length-1){
                str.append(" ");
            }
        }
        return str.toString();

    }
}
