const getXorTs = (arr: number[]) => {
  let result: number = arr[0];
  for (let i = 1; i < arr.length; i++) {
    result ^= arr[i];
  }
  return result;
};

function xorAllNumsTs(nums1: number[], nums2: number[]): number {
  const x: number = nums1.length;
  const y: number = nums2.length;
  if (x % 2 == 0 && y % 2 == 0) {
    return 0;
  } else if (x % 2 == 0) {
    return getXor(nums1);
  } else if (y % 2 == 0) {
    return getXor(nums2);
  } else {
    return getXor(nums1) ^ getXor(nums2);
  }
}
