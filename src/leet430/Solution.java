package leet430;



public class Solution {
    Node Init;
    public Node flatten(Node head) {
        Init=head;

        cal(head);
        return Init;
    }
    public Node cal(Node head){
      Node current=head;
      while (current!=null){
          if (current.child!=null){
              Node temp=current.next;
              current.next=current.child;
              current.child.prev=current;
              Node node= cal(current.child);
             node.next=temp;
              if (temp!=null){
                  temp.prev=node;
              }
              current.child=null;
          }
          if (current.next==null){
              return current;
          }
          current=current.next;
      }
        return null;
    }
}

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}