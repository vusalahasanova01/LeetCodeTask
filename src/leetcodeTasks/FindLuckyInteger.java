package leetcodeTasks;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyInteger {
    public static void main(String[] args) {
        int[] arr ={2,2,2,3,3};
        int lucky = findLucky(arr);
        System.out.println(lucky);
    }

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> array = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!array.containsKey(arr[i])) {
                array.put(arr[i], 1);
            } else {
                Integer value = array.get(arr[i]);
                value = value + 1;
                array.put(arr[i], value);

            }
        }

        int result = -1;
        for (Map.Entry<Integer, Integer> entry : array.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (key == value && key > -1) {
                result = key;
            }

        }
        return result;
    }
}
