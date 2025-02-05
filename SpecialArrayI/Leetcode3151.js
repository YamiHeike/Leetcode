/**
 * @param {number[]} nums
 * @return {boolean}
 */
var isArraySpecial = function (nums) {
  return nums.slice(1).every((num, i) => num % 2 != nums[i] % 2);
};
