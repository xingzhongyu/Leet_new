package leet2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num=0;
        ListNode start=new ListNode();
        ListNode head=start;
        while (l1!=null||l2!=null){
            start.next=new ListNode();
            start=start.next;
            int sum= (l1 != null ? l1.val : 0) + (l2!=null? l2.val : 0)+num;
            start.val= sum%10;



            num=sum/10;

            l1= l1 != null ? l1.next : null;
            l2=l2!=null?l2.next:null;
        }
       if (num!=0){
           start.next=new ListNode(num);
       }
       return head.next;

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


