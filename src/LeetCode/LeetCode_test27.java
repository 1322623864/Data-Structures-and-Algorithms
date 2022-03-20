package LeetCode;
//移除元素(双指针法)
public class LeetCode_test27 {

    static class Solution {
        public int removeElement(int[] nums, int val){
            int fastpoint = 0;
            int slowpoint;
            for (slowpoint = 0; fastpoint < nums.length ; fastpoint++){
                if(nums[fastpoint]!=val){
                    nums[slowpoint] = nums[fastpoint];
                    slowpoint++;
                }

            }
            return slowpoint;

        }
    }

}

