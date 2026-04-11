public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> s = new HashSet<ListNode>();

        while(head!=null){
            if(s.contains(head)) return true;

            s.add(head);
            head = head.next;
        }

        return false;
    }
}