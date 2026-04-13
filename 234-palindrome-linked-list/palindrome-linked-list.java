class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow);
        ListNode first = head;

        while(first!=null && second!=null){
            if(first.val!=second.val) return false;
            first = first.next;
            second = second.next;
        }

        return true;
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