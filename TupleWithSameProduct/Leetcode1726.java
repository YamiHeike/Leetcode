package TupleWithSameProduct;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1726 {
    public int withMerge(int[] nums) {
        if(nums.length < 4) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int freq = map.merge(nums[i]*nums[j], 1, Integer::sum);
                count += (freq - 1) * 8;
            }
        }
        return count;
    }

    public int optimized(int[] nums) {
        if(nums.length < 4) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                int freq = map.getOrDefault(product, 0);
                count += freq * 8;
                map.put(product, freq+1);
            }
        }
        return count;
    }


    public int initial(int[] nums) {
        if(nums.length < 4) return 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
        }
        
        int count = 0;

        for(int cnt : map.values()) {
            count += (cnt * (cnt - 1)) / 2 * 8;
        }

        return count;
    }
}

