class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = null, next = null;
        while(list1!=null && list2!=null){
            ListNode nn = null;
            if(list1.val<list2.val){
                nn = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                nn = new ListNode(list2.val);
                list2 = list2.next;
            }

            if(res==null){
                res = nn;
                next = nn;
            }else{
                next.next = nn;
                next=nn;
            }
        }

        while(list1!=null){
            ListNode nn = new ListNode(list1.val);
            if(res==null){
                res = nn;
                next = nn;
            }else{
                next.next = nn;
                next=nn;
            }
            list1 = list1.next;
        }

        while(list2!=null){
            ListNode nn = new ListNode(list2.val);
            if(res==null){
                res = nn;
                next = nn;
            }else{
                next.next = nn;
                next=nn;
            }
            list2 = list2.next;
        }

        return res;
    }
}