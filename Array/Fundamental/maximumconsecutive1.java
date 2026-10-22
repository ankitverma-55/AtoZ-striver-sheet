//package Array.Fundamental;

public class maximumconsecutive1 {

    public static void main(String[] args) {
        int numbers[] = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };
        int ans = maxConsecutiveOnes(numbers);
        System.out.println(ans);
    }
    public static int maxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
