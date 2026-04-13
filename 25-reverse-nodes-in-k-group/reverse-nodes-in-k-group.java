class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode header = head, tailor = head, prevTail = null;
        while(tailor!=null){
            count++;
            if(count == k){
                ListNode next = tailor.next;
                ListNode temp = reverse(header, next);
                
                if(prevTail!=null){
                    prevTail.next = temp;
                }else head = temp;

                header.next = next;
                prevTail = header;

                header = next;
                tailor = next;

                count = 0;
            }else{
                tailor = tailor.next;
            } 
        }

        return head;
    }

    public ListNode reverse(ListNode head,ListNode tail){
        ListNode curr = head, prev = null;
        while(curr!=tail){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}