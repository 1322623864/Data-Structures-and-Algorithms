package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_test454 {
    class Solution {
        public int fourSumCount(int[] A,int[] B,int[] C,int[] D) {
            Map<Integer,Integer> hashtable = new HashMap<>();
            int res = 0;
            for(int i = 0;i<A.length ; i++){
                for (int k : B) {
                    int sunAB = A[i] + k;
                    if (hashtable.containsKey(sunAB)) {
                        hashtable.put(sunAB, hashtable.get(sunAB) + 1);
                    } else hashtable.put(sunAB, 1);
                }
            }
            for(int i = 0;i<C.length ; i++){
                for(int j = 0;j<D.length;j++){
                    int sunCD = -(C[i]+D[j]);
                    if(hashtable.containsKey(sunCD)){
                        res += hashtable.get(sunCD);
                    }
                }
            }
            return res;
        }
    }
}
