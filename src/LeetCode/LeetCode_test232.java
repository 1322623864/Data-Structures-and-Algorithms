package LeetCode;

import java.util.Stack;

public class LeetCode_test232 {
    class MyQueue {
        Stack<Integer> stackIn;
        Stack<Integer> stackOut;
        public MyQueue() {
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }

        public void push(int x) {
            stackIn.push(x);

        }

        public int pop() {
            dumpstackIn();
            return stackOut.pop();
        }

        public int peek() {
            dumpstackIn();
            return stackOut.peek();
        }

        public boolean empty() {
            return stackOut.isEmpty() && stackIn.isEmpty();

        }
        private void dumpstackIn(){
            if(!stackOut.isEmpty()) return;
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
    }

}
