package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_test18 {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            for(int i = 0;i<nums.length; i++){
                if(i>0 && nums[i] == nums[i-1]){
                    continue;
                }
                for(int j = i + 1; j<nums.length;j++){
                    if(j>i+1 && nums[j] == nums[j-1]){
                        continue;
                    }
                    int left = j + 1;
                    int right = nums.length - 1;

                    while(right > left){
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if(sum>target){
                            right--;
                        }
                        else if(sum<target){
                            left++;
                        } else{
                            result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));

                            while(right > left && nums[right] == nums[right - 1]) right--;
                            while(right > left && nums[left] == nums[left + 1]) left++;

                            right--;
                            left++;
                        }
                    }
                }

            }
            return result;
        }
    }
}
