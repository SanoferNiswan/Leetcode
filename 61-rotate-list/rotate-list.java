class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        int len = 1;
        ListNode curr = head;
        while(curr.next!=null){
            len++;
            curr = curr.next;
        }

        curr.next = head;
        k = k % len;
        int mid = len - k - 1;
        curr = head;
        for(int i = 0 ; i < mid ; i++){
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;

        return head;
    }
}