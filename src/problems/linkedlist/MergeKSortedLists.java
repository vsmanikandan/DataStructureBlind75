package problems.linkedlist;

import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {

    public ListNode mergeLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq =  new PriorityQueue<>((a,b) -> a.getVal() - b.getVal());
        for(ListNode node : lists) {
            if(node != null) {
                pq.offer(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode currentNode = dummy;

        while (!pq.isEmpty()) {
            ListNode smallest = pq.poll();
            currentNode.next = smallest;
            currentNode  = currentNode.next;
            if(smallest.next != null) {
                pq.offer(smallest.next);
            }
        }

        return dummy.next;
    }
}
