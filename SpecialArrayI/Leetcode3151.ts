function isArraySpecialTS(nums: number[]): boolean {
  return nums.slice(1).every((num, i) => num % 2 != nums[i] % 2);
}
