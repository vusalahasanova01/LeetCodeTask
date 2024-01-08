package leetcodeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MinimumIndexOfSumTwoList {
    public static void main(String[] args) {
        String[] list1 = {"k", "KFC"};
        String[] list2 = {"k", "KFC"};
        String[] restaurant = findRestaurant(list1, list2);
        System.out.println(Arrays.stream(restaurant).toList());
    }


    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        int sum = 0;


        for (int i = 0; i < list1.length; i++) {
            hashMap.put(list1[i], i);
        }

        int k = 0;
        for (int i = 0; i < list2.length; i++) {
            String checkS = list2[i];
            if (hashMap.containsKey(checkS)) {
                Integer i1 = hashMap.get(checkS);
                int compareSum = i1 + i;
                if (k == 0) {
                    arrayList.add(checkS);
                    sum = compareSum;
                } else if (sum == compareSum) {
                    arrayList.add(checkS);
                    sum = compareSum;
                } else if (sum > compareSum) {
                    arrayList.clear();
                    arrayList.add(checkS);
                    sum = compareSum;
                } else {
                    continue;
                }
                k++;

            }
        }

        String[] result = new String[arrayList.size()];
        for (int j = 0; j < result.length; j++) {
            result[j] = arrayList.get(j);
        }
        return result;
    }
}
