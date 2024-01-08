package leetcodeTasks;

public class MissingNumber {
    //    nums length 0 dursa 0 -9 qeder topla
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum1 = 0;
        for (int i = 0; i < length; i++) {
            sum1 = sum1 + i;
        }
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum2 = sum2 + nums[i];
        }

        return sum1 - sum2;


//        Arrays.sort(nums);
//        int num = nums[0];
//        int length = nums[nums.length - 1];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != i) {
//                return i;
//            }
//        }
//        return nums[nums.length - 1] + 1;
    }
}

