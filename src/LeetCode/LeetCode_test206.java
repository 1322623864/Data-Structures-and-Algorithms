package LeetCode;

public class LeetCode_test206 {
    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
//双指针法
    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head == null){
                return head;
            }
            ListNode pre = null;
            ListNode cur = head;
            ListNode temp = null;
            while(cur !=null){
                temp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = temp;
            }
            return pre;
        }
    }

    //递归
    class Solution02 {
        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode NewReverse = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return NewReverse;
        }
    }
}
