import java.util.ArrayList;
import java.util.List;

class Solution {
    // Returns the first numRows rows of Pascal's Triangle.
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Build each row from top to bottom.
        for (int row = 0; row < numRows; row++) {
            List<Integer> current = new ArrayList<>();

            // Fill the row with boundary value 1.
            for (int col = 0; col <= row; col++) {
                current.add(1);
            }

            // Fill only the interior positions from the previous row.
            for (int col = 1; col < row; col++) {
                int value = triangle.get(row - 1).get(col - 1) + triangle.get(row - 1).get(col);
                current.set(col, value);
            }

            triangle.add(current);
        }

        return triangle;
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        int numRows = 6;

        // instance for class Solution
        Solution sol = new Solution();

        System.out.println(sol.generate(numRows));
    }
}