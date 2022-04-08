package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_test225 {
    //双队列法
    class MyStack01 {
        Queue<Integer> queue1;
        Queue<Integer> queue2;

        public MyStack01() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();

        }

        public void push(int x) {
            queue2.offer(x);
            while(!queue1.isEmpty()){
                queue2.offer(queue1.poll());
            }
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }
        public int pop() {
            return queue1.poll();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }
    //单链表法 感觉有点像循环队列
    class MyStack02 {
        Queue<Integer> queue;

        public MyStack02() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            int n = queue.size();
            queue.offer(x);
            for(int i = 0; i<n; i++){
                queue.offer(queue.poll());
            }
        }
        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }


}
