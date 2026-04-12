class Solution {
    public void reorderList(ListNode head) {
        // find middle
        ListNode fast = head, slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next, first = head;
        slow.next = null;

        second = reverse(second);

        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head, prev = null;
        while(curr!=null){
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev; 
    }
}