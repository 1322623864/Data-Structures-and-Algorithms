package LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode_test19 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        //双指针法
        class Solution01 {
            public ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode dummy = new ListNode(0, head);
                ListNode pre = dummy;
                ListNode cur = head;
                for (int i = 0; i < n; i++) {
                    cur = cur.next;
                }
                while (cur != null) {
                    cur = cur.next;
                    pre = pre.next;
                }
                pre.next = pre.next.next;
                return dummy.next;
            }
        }

        //遍历
        class Solution02 {
            public ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode dummy = new ListNode(0,head);
                int length = getLength(head);
                ListNode cur = dummy;
                for(int i = 0; i<length-n;i++){
                    cur = cur.next;
                }
                cur.next = cur.next.next;
                return dummy.next;
            }

            public int getLength(ListNode head){
                int length = 0;
                while(head != null){
                    ++length;
                    head = head.next;
                }
                return length;
            }
        }
        // 栈
        class Solution03 {
            public ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode dummy = new ListNode(0,head);
                Deque<ListNode> stack = new LinkedList<ListNode>();
                ListNode cur = dummy;
                while(cur != null){
                    stack.push(cur);
                    cur = cur.next;
                }
                for(int i = 0;i<n;i++){
                    stack.pop();
                }
                ListNode pre = stack.peek();
                pre.next = pre.next.next;
                return dummy.next;
            }
        }
    }
}
