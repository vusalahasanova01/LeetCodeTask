package leetcodeTasks;

import java.util.*;

public class DegreeOfArray {
    public static void main(String[] args) {
        int[] exampleArr = {1, 2, 2, 3, 1, 4, 2};
        int shortestSubArray = findShortestSubArray(exampleArr);
        System.out.println(shortestSubArray);


    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, int[]> integerHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (integerHashMap.containsKey(num)) {
                int[] ints = integerHashMap.get(num);
                ints[2] = ints[2] + 1;
                ints[1] = i;
                integerHashMap.put(num, ints);
            } else {
                integerHashMap.put(num, new int[]{i, i, 1});
            }
        }

        int comparable = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (Map.Entry<Integer, int[]> entry : integerHashMap.entrySet()) {
            Integer key = entry.getKey();
            int[] value = entry.getValue();
            int valueCheck = value[2];
            if (valueCheck > comparable) {
                arrayList.clear();
                arrayList.add(key);
                comparable = valueCheck;
            } else if (valueCheck == comparable) {
                arrayList.add(key);
                comparable = valueCheck;
            } else {
                continue;
            }
        }
        int[] ints = integerHashMap.get(arrayList.get(0));
        int check = ints[1] - ints[0];
        for (int i = 1; i < arrayList.size(); i++) {
            int[] checkNum = integerHashMap.get(arrayList.get(i));
            int result = checkNum[1] - checkNum[0];
            if (result < check) {
                check = result;
            } else {
                continue;
            }
        }
        return check + 1;
    }
}
