class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> m = new HashMap<Node, Node>();
        Node curr = head;
        while(curr != null){
            m.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while(curr!=null){
            Node nn = m.get(curr);
            nn.next = m.get(curr.next);
            nn.random = m.get(curr.random);
            curr = curr.next;
        }

        return m.get(head);
    }
}