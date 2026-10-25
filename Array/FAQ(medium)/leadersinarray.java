
import java.util.ArrayList;
import java.util.Collections;
public class leadersinarray {
    public static void main(String[] args) {
        int numbers[] = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders=findLeaders(numbers);
        System.out.println(leaders);
    }
    public static ArrayList<Integer> findLeaders(int[] nums) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxFromRight = nums[nums.length - 1];
        leaders.add(maxFromRight);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                maxFromRight = nums[i];
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
