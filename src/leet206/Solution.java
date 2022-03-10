package leet206;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        if (head==null){
            return null;
        }
        ListNode current=head.next;
        head.next=null;
        while (current!=null){
            dummy.next=current;



            ListNode listNode=current.next;
            current.next=head;
            head=current;



            current=listNode;
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
