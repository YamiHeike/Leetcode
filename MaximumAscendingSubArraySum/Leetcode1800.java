package MaximumAscendingSubArraySum;

class Leetcode1800 {
    public int maxAscendingSum(int[] nums) {
        int prev = nums[0];
        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > prev) {
                currSum += nums[i];
            } else {
                currSum = nums[i];
            }
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            prev = nums[i];
        }
        return maxSum;
    }
}