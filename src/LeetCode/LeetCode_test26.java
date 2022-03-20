package LeetCode;
//删除有序数组中的重复项
public class LeetCode_test26 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int fastIndex = 1;
            int slowIndex;
            for (slowIndex = 1; fastIndex< nums.length; fastIndex++){
                if(nums[fastIndex]!=nums[fastIndex-1]){
                    nums[slowIndex]=nums[fastIndex];
                    slowIndex++;
                }
            }
            return slowIndex;
        }
    }
}
