import java.util.HashMap;
public class Majorityelement1{

    public static void main(String[] args)
    {
        int numbers[] = { 3, 2, 3 };
        int ans = majorityElement(numbers);
        System.out.println(ans);        
    }


   static  int majorityElement(int[] nums) {

        //method 1: using two for loops o(n^2) time complexity
        
        // for(int i=0;i<nums.length;i++)
        // {
        //     int count = 1;
        //     int prevelement = nums[i];
            

        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             count++;
        //         }
        //     }
        //     if(count>nums.length/2)
        //     {
        //         return prevelement;
        //     }
        // }
        // return -1;

       // Method 2: using HashMap o(n) time complexity and o(n) space complexity
        
       
    //     HashMap<Integer, Integer> mp = new HashMap<>();
    //     for(int num : nums)
    //     {
    //         mp.put(num, mp.getOrDefault(num, 0) + 1);
    //         if(mp.get(num) > nums.length/2)
    //         {
    //             return num;
    //         }
    //     }
    //     return -1;

       
    // }

    //method 3: using moore's voting algorithm o(n) time complexity and o(1) space complexity
    int count = 0;
    int prevelement = 0;
    for(int num : nums)
    {
        if(count == 0)
        {
            count = 1;
            prevelement = num;
        }
        else if(prevelement == num)
        {
            count++;
        }
        else
        {
            count--;
        }
    }
    return prevelement;
    }



}