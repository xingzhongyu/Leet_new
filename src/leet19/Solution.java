package leet19;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode current=head;
        while (current!=null){
            length++;

            current=current.next;
        }
        length=length-n;




        ListNode before=new ListNode(0);
        before.next=head;
        current=head;
        int num=0;
        while (current!=null){
            if (num==length){
                before.next=current.next;
                if (length==0){
                    return before.next;
                }else {
                    return head;
                }

            }else {
                before=current;
            }
            current=current.next;
            num++;
        }
        return null;
    }
}



 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
