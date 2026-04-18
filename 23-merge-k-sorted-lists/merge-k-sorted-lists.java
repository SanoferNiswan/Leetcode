class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 || lists==null) return null;
        return merge(lists, 0, lists.length-1);
    }

    public ListNode merge(ListNode[] lists, int left, int right){
        if(left == right) return lists[left];

        int mid = (left + right) / 2;

        ListNode l1 = merge(lists, left, mid);
        ListNode l2 = merge(lists, mid+1, right);

        return mergeTwo(l1,l2);
    }

    public ListNode mergeTwo(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next = l1;
                curr = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                curr = l2;
                l2 = l2.next;
            }
        }

        curr.next = l1!=null ? l1 : l2;

        return dummy.next;
    }
}