package LeetCode;

public class LeetCode_test1047 {
    //极简法 转换为字符数组 用数组代替集合能够快速提高效率，把 charsArray 当成栈就不会持续申请内存空间。
    //stringbuilder，stringbuffer太慢了
    class Solution01 {
        public String removeDuplicates(String S) {
            char[] s = S.toCharArray();
            int top = -1;
            for(int i = 0; i < S.length(); i++){
                if(top == -1 || s[top] != s[i]){
                    s[++top] = s[i];
                }else{
                    top--;
                }
            }
            return String.valueOf(s,0,top + 1);
        }
    }

    //模拟栈法
    class Solution02 {
        public String removeDuplicates(String s) {
            // 将 res 当做栈
            StringBuffer res = new StringBuffer();
            // top为 res 的长度
            int top = -1;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                // 当 top > 0,即栈中有字符时，当前字符如果和栈中字符相等，弹出栈顶字符，同时 top--
                if (top >= 0 && res.charAt(top) == c) {
                    res.deleteCharAt(top);
                    top--;
                    // 否则，将该字符 入栈，同时top++
                } else {
                    res.append(c);
                    top++;
                }
            }
            return res.toString();
        }
    }
}
