package leet203;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head!=null&&head.val==val){
            head=head.next;
        }
        if (head==null){
            return head;
        }
        ListNode before=head;

        ListNode current=head;
        while (current!=null){
            if (current.val==val){
                before.next=current.next;
            }else {
                before=current;
            }


            current=current.next;
        }
        return head;
    }
}





class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
