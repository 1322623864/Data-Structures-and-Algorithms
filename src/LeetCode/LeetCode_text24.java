package LeetCode;

public class LeetCode_text24 {
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
    }

    //递归
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode newHead = head.next;
            head.next = swapPairs(newHead.next);
            newHead.next = head;
            return newHead;
        }
    }

    //迭代
    class Solution02 {
        public ListNode swapPairs(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode temp = dummy;
            while (temp.next != null && temp.next.next != null) {
                ListNode pre = temp.next;
                ListNode cur = temp.next.next;
                temp.next = cur;
                pre.next = cur.next;
                cur.next = pre;
                temp = pre;


            }
            return dummy.next;
        }
    }
}
