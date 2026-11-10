package day1;

import java.util.Arrays;

class FindDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1])
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        FindDuplicate sol = new FindDuplicate();
        int[] nums = {1, 2, 3, 1};

        boolean result = sol.containsDuplicate(nums);

        System.out.println(result);
    }
}
