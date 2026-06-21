package problems.linkedlist;

import java.util.LinkedList;

public class MiddleOfLinkedList {

    public int calcMiddleOfLL(ListNode head) {
        if(head == null || head.next == null) {
            return head.getVal();
        }

        ListNode slow = head;
        ListNode fast =  head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.getVal();
    }

    public static void main(String[] args) {
        MiddleOfLinkedList m = new MiddleOfLinkedList();

        ListNode head =  new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
       /* head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
*/
        System.out.println(m.calcMiddleOfLL(head));

    }

}
