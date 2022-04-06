package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_test01 {
    //暴力枚举法
    class Solution01 {
        public int[] twoSum(int[] nums, int target) {
            for(int i = 0; i<nums.length ;i++){
                for(int j = i+1;j<nums.length ;j++){
                    if(nums[i]+nums[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
            return null;
        }
    }
    //哈希表法
    class Solution02 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer , Integer> hashtable = new HashMap<Integer,Integer>();
            for(int i = 0;i<nums.length;i++){
                if(hashtable.containsKey(target - nums[i])){
                    return new int[]{hashtable.get(target - nums[i]),i};
                }
                hashtable.put(nums[i],i);
            }
            return new int[0];
        }
    }
}
