package leet61;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int length=0;
        if (head==null){
            return null;
        }
        ListNode current=head;
        while (current.next!=null){
            current=current.next;
            length++;



        }
        length++;
        current.next=head;



        length=length-(k%length)-1;
        int num=0;
        while (head!=null){
            if (num==length){
                ListNode listNode=head.next;
                head.next=null;
                return listNode;
            }
            num++;
            head=head.next;
        }
        return null;
    }
}



 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


