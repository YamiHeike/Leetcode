class Leetcode1800:
    def maxAscendingSum(self, nums: List[int]) -> int:
        prev = nums[0]
        currSum = nums[0]
        maxSum = nums[0]
        for num in nums[1:]:
            if num > prev:
                currSum = currSum + num
            else:
                currSum = num
            
            if currSum > maxSum:
                maxSum = currSum
            
            prev = num

        return maxSum