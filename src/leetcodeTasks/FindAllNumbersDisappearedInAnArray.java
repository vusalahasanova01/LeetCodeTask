package leetcodeTasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> given = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            given.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!given.contains(i)) {
                arrayList.add(i);
            }
        }

        return arrayList;

    }
}
