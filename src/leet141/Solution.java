package leet141;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null){
            if (fast.next==null){
                break;
            }
            fast=fast.next.next;
            slow=slow.next;

            if (slow==fast){
                return true;
            }
        }
        return false;
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
