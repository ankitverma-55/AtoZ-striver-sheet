//package Array.FAQ(medium);

public class Rearrangearrayelementsbysign {
    public static void main(String[] args) {
        int numbers[] = { -1, 2, -3, 4, -5, 6 };
        int[] rearrangedArray =  rearrangeArray(numbers);
        for (int i = 0; i < rearrangedArray.length; i++) {
            System.out.print(rearrangedArray[i] + " ");
        }
        
    }
     public static int[] rearrangeArray(int[] nums) {
        
              int[] result = new int[nums.length];
        
        // Pointers for tracking the next available index for positive/negative numbers
        int posIndex = 0;
        int negIndex = 1;
        
        // Traverse the original array exactly once (O(N) time)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[posIndex] = nums[i];
                posIndex += 2; // Move to the next even index
            } else {
                result[negIndex] = nums[i];
                negIndex += 2; // Move to the next odd index
            }
        }
        
        return result;
    }
}
