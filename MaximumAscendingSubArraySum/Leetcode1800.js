/**
 * @param {number[]} nums
 * @return {number}
 */
var Leetcode1800 = function (nums) {
  let prev = nums[0];
  let maxSum = nums[0];
  let currSum = nums[0];

  for (let i = 1; i < nums.length; i++) {
    if (nums[i] > prev) {
      currSum += nums[i];
    } else {
      currSum = nums[i];
    }
    if (currSum > maxSum) {
      maxSum = currSum;
    }
    prev = nums[i];
  }
  return maxSum;
};
