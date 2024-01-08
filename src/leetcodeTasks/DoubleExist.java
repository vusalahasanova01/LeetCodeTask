package leetcodeTasks;

public class DoubleExist {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] && i != j) {
                    return true;
                }
            }

        }
        return false;

//TODO SOLUTION 2
//        Map<Integer, Integer> map = new HashMap<>();
//        int n = arr.length;
//        for (int i = 0; i < n; i++){
//            map.put(arr[i], i);
//        }
//        for (int i = 0; i < n; i++) {
//            if (map.containsKey(2 * arr[i]) &&
//                    map.get(2 * arr[i]) != i) {
//                return true;
//            }
//        }
//
//        return false;    }
//}
    }
}