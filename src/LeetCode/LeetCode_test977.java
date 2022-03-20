package LeetCode;

public class LeetCode_test977 {
    //双指针法

        public int[] sortedSquares01(int[] nums) {
            int[] ans = new int[nums.length];
            int result = ans.length - 1;
            int right = nums.length - 1 ;
            int left = 0;
            while(left <= right){
                if(nums[right]*nums[right] < nums[left]*nums[left]){
                    ans[result--] = nums[left]*nums[left];
                    left++;
                }else{
                    ans[result--] = nums[right]*nums[right];
                    right--;
                }
            }
            return ans;

        }
    }

    //暴力解法

//        public int[] sortedSquares02(int[] nums) {
//            int[] ans = new int[nums.length];
//            for(int i = 0; i<nums.length ; i++){
//                ans[i] = nums[i]*nums[i];
//            }
//            Arrays.sort(ans);
//            return ans;
//        }
//    }
//}
