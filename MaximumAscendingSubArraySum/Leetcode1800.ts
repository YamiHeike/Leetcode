function maxAscendingSum(nums: number[]): number {
  let prev: number = nums[0];
  let maxSum: number = nums[0];
  let currSum: number = nums[0];
  for (let i = 0; i < nums.length; i++) {
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
}
