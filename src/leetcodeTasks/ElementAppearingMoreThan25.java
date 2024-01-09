package leetcodeTasks;

public class ElementAppearingMoreThan25 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        System.out.println(arr.length);
        int specialInteger = findSpecialInteger(arr);
        System.out.println(specialInteger);
    }

    public static int findSpecialInteger(int[] arr) {
        double checkPercentage = (double) arr.length / 100 * 25;
        System.out.println(checkPercentage);
        int count = 1;
        if (arr.length == 1) {
            return arr[0];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                if (count > checkPercentage) {
                    return arr[i];
                }
            } else {
                count = 1;
            }
        }
        return -1;
    }
}
