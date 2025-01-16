class Solution(object):
    def xorAllNums(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: int
        """
        x = len(nums1)
        y = len(nums2)
        if x % 2 == 0 and y % 2 == 0:
            return 0
        elif x % 2 == 0:
            return getXor(nums1)
        elif y % 2 == 0:
            return getXor(nums2)
        else:
            return getXor(nums1) ^ getXor(nums2)
        

def getXor(arr):
    res = arr[0]
    for elem in arr[1:]:
        res = res ^ elem
    return res