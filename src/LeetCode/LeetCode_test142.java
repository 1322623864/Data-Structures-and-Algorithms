package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_test142 {
   class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
   //哈希表
    public class Solution01 {
        public ListNode detectCycle(ListNode head) {
            ListNode pos = head;
            Set<ListNode> visited = new HashSet<ListNode>();
            while(pos != null){
                if(visited.contains(pos)){
                    return pos;
                }else{
                    visited.add(pos);
                }
                pos = pos.next;
            }
            return null;
        }
    }
    //  双指针法
    public class Solution02 {
        public ListNode detectCycle(ListNode head) {
            if(head == null){
                return null;
            }
            ListNode fast = head,slow = head;
            while(fast != null){
                slow = slow.next;
                if(fast.next != null){
                    fast = fast.next.next;
                }else{
                    return null;
                }
                if(slow == fast){
                    ListNode ptr = head;
                    while(ptr != slow){
                        ptr = ptr.next;
                        slow = slow.next;
                    }
                    return ptr;
                }

            }
            return null;
        }
    }


}
