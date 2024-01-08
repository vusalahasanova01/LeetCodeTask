package leetcodeTasks;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer, Integer> result = new HashMap<>();
        int answer = -1;

        for (int num : nums) {
            if (!result.containsKey(num)) {
                result.put(num, 1);
            } else {
                int count = result.get(num) + 1;

                if (count > nums.length / 2) {
                    answer = num;
                } else {
                    result.put(num, count);
                }
            }

        }
        return answer;

    }

}
