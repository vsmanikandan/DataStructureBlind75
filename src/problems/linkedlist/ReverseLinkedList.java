package problems.linkedlist;

public class ReverseLinkedList {


    public ListNode reverseLinkedList(ListNode head) {

        ListNode prev = null;
        ListNode curreNode = head;

        while(curreNode != null) {
            ListNode nextNode = curreNode.next;
            curreNode.next = prev;
            prev = curreNode;
            curreNode = nextNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        ReverseLinkedList solver = new ReverseLinkedList();

        // Create list: 1 -> 2 -> 3 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        System.out.print("Original list: ");

        ListNode reversedHead = solver.reverseLinkedList(head);

        System.out.println(reversedHead.getVal());
    }


}
