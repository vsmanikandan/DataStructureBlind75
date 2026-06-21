package problems.linkedlist;

public class CycleInLinkedList {

    public boolean isCycleExist(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        CycleInLinkedList m = new CycleInLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head.next;
       /* head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
*/
        System.out.println(m.isCycleExist(head));
    }
}
