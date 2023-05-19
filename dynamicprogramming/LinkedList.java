package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        ListNode n3 = new ListNode(1);
        n3.next = new ListNode(2);
        n3.next.next = new ListNode(3);
        ListNode r3 = reverseList(n3);
        

    }
    public static ListNode reverseList(ListNode head) {
            ListNode[] nodes=new ListNode[5];
            List<ListNode> list=new ArrayList<>();
            if(head==null){
                return head;
            }
            ListNode newHead=head;
            if(head.next!=null){
                newHead=reverseList(head.next);
                head.next.next=head;
            }
            head.next=null;
            return newHead;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
