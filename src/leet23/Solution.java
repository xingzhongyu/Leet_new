package leet23;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0){
            return null;
        }

        return mergeList(lists,0, lists.length-1);
    }
    public ListNode mergeList(ListNode[] listNodes,int start,int end){
        if (start==end){
            return listNodes[start];
        }
        int medium=(start+end)/2;
        ListNode listNode1=mergeList(listNodes,start,medium);
        ListNode listNode2=mergeList(listNodes,medium+1,end);
        ListNode dummy=new ListNode();
        ListNode current=dummy;
        while (listNode1!=null&&listNode2!=null){

            if (listNode1.val>= listNode2.val){
                current.next=listNode2;
                listNode2=listNode2.next;
            }else {
                current.next=listNode1;
                listNode1=listNode1.next;
            }

            current=current.next;

        }
        current.next=(listNode1==null?listNode2:listNode1);
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

