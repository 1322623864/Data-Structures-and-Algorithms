package LeetCode;

public class LeetCode_test209 {
    //暴力解法
    public int minSubArrayLen01(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i ++){
            int sum = nums[i];
            if(sum>=target){
                return 1;
            }
            for(int j = i+1;j< nums.length;j++){
                sum += nums[j];
                if(sum >= target){
                    len = Math.min(len,j-i+1);
                    break;
                }
            }

        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
    //滑动窗口
    public int minSubArrayLen02(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length ; right++){
            sum += nums[right];
            while(sum >= target){
                min = Math.min(min,right - left + 1);
                sum -= nums[left++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;

    }

}

