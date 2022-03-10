package leet92;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;
        for (int i = 0; i <left-1 ; i++) {
            prev=prev.next;
        }
        ListNode current=prev.next;
        ListNode next;
        for (int i = 0; i <right-left ; i++) {
            next=current.next;
            current.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return dummy.next;
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
