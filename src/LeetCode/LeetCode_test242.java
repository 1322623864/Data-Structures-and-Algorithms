package LeetCode;

import java.util.Arrays;

public class LeetCode_test242 {
    //直接排序法
    class Solution01 {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
            char[] str1 = s.toCharArray();
            char[] str2 = t.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            return Arrays.equals(str1,str2);
        }
    }
    //哈希表法
    class Solution02 {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
            int[] table = new int[26];
            for(int i = 0; i<s.length();i++){
                table[s.charAt(i) - 'a']++;
            }
            for(int i = 0; i<t.length();i++){
                table[t.charAt(i) - 'a']--;
                if(table[t.charAt(i) - 'a'] < 0){
                    return false;
                }
            }
            return true;
        }
    }
}
