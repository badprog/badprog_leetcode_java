// import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // System.out.println("nums = " + Arrays.toString(nums) + "\n");

        for (int i = 0; i < nums.length; i++) {
            // System.out.println("hashMap = " + hashMap);
            int toFind = target - nums[i];
            // System.out.println("toFind = " + target + " - " + nums[i]);
            // System.out.println("toFind = " + toFind);

            Integer exist = hashMap.get(toFind);
            // System.out.println("exist = " + exist + "\n");
            if (exist != null) {
                int[] result = new int[]{i, exist};
                Arrays.sort(result);

                return result;
            }


            hashMap.put(nums[i], i);
        }

        return new int[]{};
    }
}