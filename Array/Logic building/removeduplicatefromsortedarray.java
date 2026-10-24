//package Array.Logic building;

public class removeduplicatefromsortedarray {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 2, 2, 2, 2, 2, 2 };
        int newLength = removeDuplicates(numbers);
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static int removeDuplicates(int[] nums) {
       if(nums.length==0)return 0;
       int x=1;
       for(int i=1 ;i<nums.length;i++){
           if(nums[i]!=nums[i-1]){
               nums[x]=nums[i];
               x++;
           }
       }
       return x;
    }
}
