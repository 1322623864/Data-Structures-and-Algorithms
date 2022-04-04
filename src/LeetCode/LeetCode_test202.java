package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_test202 {
    //双指针法
    class Solution01 {
        public int getNext(int n){
            int sum = 0;
            while(n>0){
                int d = n%10;
                sum += d*d;
                n = n / 10;
            }
            return sum;
        }

        public boolean isHappy(int n) {
            int slowRunner = n;
            int fastRunner = getNext(n);
            while(fastRunner != 1&&slowRunner!=fastRunner){
                slowRunner = getNext(slowRunner);
                fastRunner = getNext(getNext(fastRunner));
            }
            return fastRunner ==1;
        }
    }

    //哈希表法
    class Solution02 {
        public int getNext(int n){
            int sum = 0;
            while(n>0){
                int d = n%10;
                sum += d*d;
                n = n / 10;
            }
            return sum;
        }

        public boolean isHappy(int n) {
            Set<Integer> set = new HashSet<>();
            while(n != 1 && !set.contains(n)){
                set.add(n);
                n = getNext(n);
            }
            return n == 1;
        }
    }
}
