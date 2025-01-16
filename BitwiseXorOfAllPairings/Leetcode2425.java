public class Leetcode2425 {
    public int xorAllNums(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length == 0) return 0;

        int x = nums1.length;
        int y = nums2.length;

        if(x % 2 == 0 && y % 2 == 0) {
            return 0;
        } else if(x % 2 == 0) {
            return getXor(nums1);
        } else if(y % 2 == 0) {
            return getXor(nums2);
        } else {
            int xor1 = getXor(nums1);
            int xor2 = getXor(nums2);
            return xor1 ^ xor2;
        }
    }

    private int getXor(int[] arr) {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }
}
