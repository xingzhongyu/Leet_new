package leet21;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode current=dummy;
        while (list1!=null||list2!=null){
            ListNode next;
            if (list1==null){
                next=list2;
                list2=list2.next;
            }else if (list2==null){
                next=list1;
                list1=list1.next;
            }else if (list1.val>= list2.val){
               next=list2;
               list2=list2.next;
            }else {
                next=list1;
                list1=list1.next;
            }

            current.next=next;
            current=current.next;
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

