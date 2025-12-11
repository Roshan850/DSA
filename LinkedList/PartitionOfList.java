public class PartitionOfList {
    public Node doCode(Node head, int x) {
        Node before_head = new Node(0);
        Node before = before_head;
        Node after_head = new Node(0);
        Node after = after_head;


        while (head != null) {
            if (head.data < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next =head;
                after = after.next;
            }
            head = head.next;
        }

        after.next = null;
        before.next = after_head.next;

        return before_head.next;

    }
    public void print(Node head) {
        Node temp = head;
        if (temp == null) {
            System.out.println("LL is empty");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);


        PartitionOfList p = new PartitionOfList();
        p.print(head);
        Node res =p.doCode(head,3);
        p.print(res);

    }

}
