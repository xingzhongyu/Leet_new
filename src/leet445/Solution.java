package leet445;

import java.util.Stack;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> stack1=new Stack<>();
        while (l1!=null||l2!=null){
            if (l1!=null){
                stack.push(l1.val);
                l1=l1.next;
            }
            if (l2!=null){
                stack1.push(l2.val);
                l2=l2.next;
            }
        }
        int carry=0;
        ListNode head=new ListNode();
        ListNode dummy=head;
        ListNode current=null;
        while ((!stack.isEmpty())||(!stack1.isEmpty())||carry!=0){
           head.next=new ListNode();
           head=head.next;
            int sum=(stack.isEmpty()?0:stack.pop())+(stack1.isEmpty()?0:stack1.pop())+carry;
            head.val=sum%10;
            carry=sum/10;
            head.next=current;
            current=head;
            head=dummy;
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

