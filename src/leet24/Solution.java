package leet24;

import java.util.List;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        if (head==null){
            return null;
        }
        ListNode current=head;
        ListNode before=dummy;
        while (current!=null&&current.next!=null){
                ListNode temp=current.next;
                current.next=current.next.next;
                temp.next=current;
                before.next=temp;
                before=current;
                current=temp;
                current=current.next.next;

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
