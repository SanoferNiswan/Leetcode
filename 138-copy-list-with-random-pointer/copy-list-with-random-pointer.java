class Solution {
    public Node copyRandomList(Node head) {
        // insert copied nodes in between original node
        Node curr = head;
        while(curr!=null){
            Node nn = new Node(curr.val);
            Node next = curr.next;
            curr.next = nn;
            nn.next = next;

            curr = next;
        }

        // copy random pointer
        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // separate lists
        Node copyHead = new Node(0); // dummy node
        Node copyCurr = copyHead;
        curr = head;

        while(curr!=null){
            Node copy = curr.next;
            Node next = copy.next;

            copyCurr.next = copy;
            curr.next = next;

            copyCurr = copy;
            curr = next;
        }

        return copyHead.next;
    }
}