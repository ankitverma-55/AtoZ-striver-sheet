//package Array.Logic building;
import java.util.Arrays;

public class movezerotoend {
    public static void main(String[] args) {
        int numbers[] = { 0, 1, 0, 3, 12 };
        moveZeroes(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int nonZeroIndex = 0; // Pointer to track the position of non-zero elements
        // Move non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {   
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < n; i++) {
            nums[i] = 0;
        }       

       

       
      
        
    }
}
