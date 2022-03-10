package leet142;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null){
            if (fast.next!=null){
                fast=fast.next.next;

            }else {
                return null;
            }
            slow=slow.next;
            if (fast==slow){
                ListNode ptr=head;
                while (ptr!=slow){
                    ptr=ptr.next;
                    slow=slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }


  }

