
public class LL {
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInd(int ind, int data) {
        if (ind == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while (i < ind - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int searchKey(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (key == temp.data) {
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;
    }

    public void reverseLL() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // HELPER FUNCTION
    public Node findMid(Node head) { // SLOW FAST APPROACH TO FIND THE MID OF THE LINKED LIST
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

        }
        return slow; // slow is the middle
    }

    public boolean checkPalindrome() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 to find the middle

        Node middle = findMid(head);

        // step 2 reverse the 2ndhalf ll
        Node prev = null;
        Node curr = middle;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half end;
        Node left = head;

        // step 3 check right and left ll
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }

    public void removeCycle() {
        // DETECTING CYCLE
        Node slow = head;
        Node fast = head;

        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }

        }

        if (cycle == false) {
            return;

        }
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove cycle -> last.next = null
        prev.next = null;

    }

    // Give the index where cycle is start
    public Node detectCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // detect cycle in the linked list
            if (slow == fast) {
                slow = head;

                // find the node where the cycle is start
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;

                }
                return slow;
            }

        }
        // if cycle is not foud the return null
        return null;
    }

    // public Node reverseBetween(Node head, int left, int right) {
    // if(left == 1 && right == 1){
    // return head;
    // }
    // Node prev = null ;
    // Node curr;
    // Node next ;
    // Node temp = head;
    // while (temp !=null){
    // temp = curr = temp.next ;
    // if(curr. data == left){
    // while(curr.data != right){

    // next = curr.next;
    // curr.next = prev ;
    // prev = curr;
    // curr =next;
    // }
    // if(head.data == left){
    // head = prev;
    // }
    // return head;
    // }

    // }
    // }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is emptly ");
            return -1;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;

            size--;
            return val;
        }
        int i = 0;
        Node prev = head;
        for (i = 0; i < size - 2; i++) {
            prev = prev.next;

        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public void removeNthNodeFormEnd(int n) {
        int s = 0;
        Node temp = head;
        while (temp != null) {
            s++;
            temp = temp.next;
        }
        if (n == s) {
            head = head.next;
            return;
        }

        int i = 1;
        int ind = s - n;
        Node prev = head;
        while (i < ind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;

    }

    public boolean isCylcle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

    private Node findmidM(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // STEP 1: find the middle node
        Node mid = findmidM(head);

        // STEP 2: Apply merge sort on left half and right half
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft = sortList(head);
        Node newright = sortList(rightHead);

        // STEP 3: merge the lists
        return mergeTwoLists(newleft, newright);
    }

    private Node mergeTwoLists(Node list1, Node list2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        while (list1 != null) {
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        while (list2 != null) {
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public Node reorderdList(Node head) {
        // STEP1 : find the middle node of ll
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // step 2 : reverse second half of the ll

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Alternate merging
        Node LH = head;
        Node RH = prev;
        Node nextL, nextR;
        while (LH != null && RH != null) {
            // zig zag
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            // updating
            RH = nextR;
            LH = nextL;

        }

        return head;
    }

    public Node  removeLinkedlistElement(Node head, int val) {
        // step 1 : No any node 
       
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;
        Node curr = head;
        
        while (curr != null) {

            if (curr.data == val) {
                prev.next = curr.next;

            } else {
                prev = curr;

            }
            curr = curr.next;
        }
        return dummy.next;

    }

    public void print() {
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

    public Node head;
    public Node tail;
    public int size;

    public static void main(String[] args) {
        LL ll = new LL();
        // ll.addFirst(10);
        // ll.addFirst(20);

        // System.out.println("Deleted element is "+ll.removeFirst());

        // ll.print();
        // ll.addLast(40);
        // ll.addInd(1, 70);
        // System.out.println(ll.size);
        // ll.addLast(50);
        // ll.print();
        // ll.addFirst(100);
        // ll.addInd(4, 80);
        // // System.out.println("Deleted element is "+ll.removeFirst());
        // ll.print();
        // // System.out.println("the index is"+ll.searchKey(1000));
        // // System.out.println("Deleted element is "+ll.removeLast());
        // // System.out.println("Deleted element is "+ll.removeLast());
        // ll.print();
        // // ll.reverseLL();
        // // ll.reverseBetween(ll.head, 20, 80);
        // ll.removeNthNodeFormEnd(4);

        // palindrome input
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(2);
        // ll.addFirst(1);

        // ll.print();
        // System.out.println(ll.checkPalindrome());

        // remove cycle intput
        // ll.head = new Node(10);
        // Node temp = new Node(60);

        // ll.head.next = temp;
        // ll.head.next.next = new Node(30);

        // ll.head.next.next.next = temp;

        // // System.out.println(ll.isCylcle());
        // // ll.removeCycle();
        // // System.out.println(ll.isCylcle());
        // // ll.print();

        // Node found = ll.detectCycle();
        // System.out.println(found.data);

        ll.head = new Node(1);
        ll.head.next = new Node(4);
        ll.head.next.next = new Node(6);
        ll.head.next.next.next = new Node(1);
        ll.head.next.next.next.next = new Node(9);
        ll.head.next.next.next.next.next = new Node(2);
         ll.head.next.next.next.next.next.next = new Node(1);
        // ll.head.next.next.next.next.next.next = new Node(12);

        // ll.print();
        // ll.sortList(ll.head);
        ll.print();
        ll.reorderdList(ll.head);
        ll.print();
        // System.out.println(ll.removeLinkedlistElement(ll.head,1));
        // ll.print();

    }

}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
