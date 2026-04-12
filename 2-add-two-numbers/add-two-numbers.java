class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = l1, prev = null;
        while(l1!=null && l2!=null){
            int val = l1.val + l2.val + carry;
            l1.val = val%10;
            carry = val/10;
            prev = l1;
            l1=l1.next;
            l2 = l2.next;
        }

        while(l1!=null){
            int val = l1.val + carry;
            l1.val = val % 10;
            carry = val/10;
            prev = l1;
            l1 = l1.next;
        }

        while(l2!=null){
            int val = l2.val+carry;
            l2.val = val%10;
            carry = val/10;
            prev.next = l2;
            prev = prev.next;
            l2 = l2.next;
        }

        if(carry ==1 ) prev.next = new ListNode(1);

        return head;
    }
}