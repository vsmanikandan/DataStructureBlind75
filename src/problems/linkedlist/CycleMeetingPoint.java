package problems.linkedlist;

public class CycleMeetingPoint {


    public int calcMeetingPointCycle(ListNode head) {
        if(head == null || head.next == null) {
            return -1;
        }

        ListNode slow = head;
        ListNode fast = head;

        boolean hasCycle = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle) {
            return -1;
        }

        fast = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast.getVal();
    }

    public static void main(String[] args) {
        CycleMeetingPoint m = new CycleMeetingPoint();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next;
                //new ListNode(6);
        System.out.println(m.calcMeetingPointCycle(head));
    }

}
