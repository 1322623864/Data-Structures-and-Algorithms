package LeetCode;

public class LeetCode_test203 {
    class ListNode {
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

        //添加虚节点方式
        public ListNode removeElements01(ListNode head, int val) {
            if (head == null) {
                return head;
            }
            // 因为删除可能涉及到头节点，所以设置dummy节点，统一操作
            ListNode dummy = new ListNode(-1, head);
            ListNode pre = dummy;
            ListNode cur = head;
            while (cur != null) {
                if (cur.val == val) {
                    pre.next = cur.next;
                } else {
                    pre = cur;
                }
                cur = cur.next;
            }
            return dummy.next;
        }

        //不添加虚拟节点方式
        public ListNode removeElements02(ListNode head, int val) {
            while (head != null && head.val == val) {
                head = head.next;
            }
            // 已经为null，提前退出
            if (head == null) {
                return head;
            }
            // 已确定当前head.val != val
            ListNode pre = head;
            ListNode cur = head.next;
            while (cur != null) {
                if (cur.val == val) {
                    pre.next = cur.next;
                } else {
                    pre = cur;
                }
                cur = cur.next;
            }
            return head;
        }
    }

    //递归
    class Solution {
        public ListNode removeElements(ListNode head, int val) {

            if(head ==null){
                return head;
            }
            head.next = removeElements(head.next,val);
            return head.val == val ? head.next : head;
        }
    }
}
