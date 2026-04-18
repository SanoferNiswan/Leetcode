/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>((a, b)-> a.val - b.val);
        for(ListNode node: lists){
            if(node!=null) minHeap.add(node);
        }
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(!minHeap.isEmpty()){
            ListNode curr = minHeap.poll();
            tail.next = curr;
            tail = curr;

            if(curr.next!=null) minHeap.add(curr.next);
        }

        return dummy.next;
    }
}