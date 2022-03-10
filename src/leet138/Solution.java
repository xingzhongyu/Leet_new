package leet138;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public Node copyRandomList(Node head) {
        List<Integer> list=new ArrayList<>();
        Node dummy=new Node(0);
        Node current=dummy;



        Node h=head;
        while (head!=null){
            current.next=new Node(head.val);


            list.add(find(h,head.random));
            head=head.next;
            current=current.next;

        }
        current=dummy.next;
        while (current!=null){
            int location=list.remove(0);
            if (location==-1){
                current.random=null;
            }else {
                current.random= findNode(dummy.next,location);
            }

            current=current.next;
        }

        return dummy.next;
    }
    public int find(Node head,Node target){
        if (target==null){
            return -1;
        }
        int index=0;
        while (head!=null&&head!=target){
            index++;
            head=head.next;
        }
        if (head==null){
            return -1;
        }else {
            return index;

        }
    }
    public Node findNode(Node head,int index){
        int location=0;
        while (head!=null&&location<index){
            head=head.next;
            location++;
        }
        return head;
    }
}
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

