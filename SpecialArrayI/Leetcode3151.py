from typing import List


class Solution:
    def isArraySpecial(self, nums: List[int]) -> bool:
        for i in range(len(nums) - 1):
            if nums[i] % 2 == nums[i+1] % 2:
                return False
        return True

    def isArraySpecialAll(self, nums: List[int]) -> bool:
        return all(nums[i] % 2 != nums[i+1] % 2 for i in range(len(nums) - 1))