package LeetCode;

public class LeetCode_test383 {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] record = new int[26];
            for( int i = 0; i < magazine.length(); i++){
                record[magazine.charAt(i) - 'a']++;
            }
            for( int j = 0; j < ransomNote.length(); j++){
                record[ransomNote.charAt(j) - 'a']--;
                if(record[ransomNote.charAt(j) - 'a']<0 ){
                    return false;
                }
            }
            return true;
        }
    }
}
