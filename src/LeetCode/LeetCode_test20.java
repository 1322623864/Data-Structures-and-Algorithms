package LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode_test20 {
    class Solution01 {
    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        char ch;
        for(int i = 0;i<s.length();i++){
            ch = s.charAt(i);
            if(ch == '('){
                deque.push(')');
            }else if(ch == '['){
                deque.push(']');
            }else if(ch == '{'){
                deque.push('}');
            }else if(deque.isEmpty() || deque.peek() != ch){
                return false;
            }
            else{
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
    class Solution02 {
        public boolean isValid(String s) {
            int length = s.length() / 2;
            for(int i = 0; i < length; i++){
                s = s.replace("()","").replace("[]","").replace("{}","");
            }
            return s.length() == 0;
        }
    }

}
