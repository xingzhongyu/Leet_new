package leet25;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;
        ListNode current=prev.next;
        ListNode next;
        while (length(prev,k)) {
            for (int j = 0; j < k-1; j++) {
                next=current.next;
                current.next=next.next;
                next.next=prev.next;



                prev.next=next;
            }
            prev=current;
        }
        return dummy.next;

    }
    boolean length(ListNode head,int k){
        while (k>0){
            if (head==null){
                return false;
            }
            head=head.next;
            k--;

        }
        return true;
    }
}



//  Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

