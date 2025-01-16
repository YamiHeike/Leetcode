/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var xorAllNums = function (nums1, nums2) {
  x = nums1.length;
  y = nums2.length;
  if (x % 2 === 0 && y % 2 === 0) {
    return 0;
  } else if (x % 2 === 0) {
    return getXor(nums1);
  } else if (y % 2 === 0) {
    return getXor(nums2);
  } else {
    return getXor(nums1) ^ getXor(nums2);
  }
};

const getXor = (even) => {
  result = even[0];
  for (let i = 1; i < even.length; i++) {
    result ^= even[i];
  }
  return result;
};
