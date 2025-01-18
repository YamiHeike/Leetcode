from functools import reduce
from typing import List

class Leetcode2638:
    def doesValidArrayExist(self, derived: List[int]) -> bool:
        return reduce(lambda a,b : a ^ b, derived) == 0