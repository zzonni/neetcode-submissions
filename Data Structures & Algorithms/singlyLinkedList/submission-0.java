class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1); // dummy node
        this.tail = this.head;
    }

    // return the value of the i node (0-indexed), if the index is out of bounds => return -1
    public int get(int index) {
        ListNode current = head.getNext(); // first node if initialized, next node if already inserted
        int i = 0;
        while (current != null) { // if have more than 1 node
            if (i == index) return current.value;
            i++;
            current = current.getNext(); // move to next node
        }
        return -1;
    }

    // insert a node with val at the head of the list
    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.setNext(this.head.getNext());
        this.head.setNext(newNode);
        if (newNode.getNext() == null) {
            this.tail = newNode;
        }
    }

    // insert a node with val at the tail of the list
    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        this.tail.setNext(newNode);
        this.tail = this.tail.getNext();
    }

    // remove the i node. if the index is out of bounds, return false, else return true
    public boolean remove(int index) {
        // traverse to node index
        int i = 0;
        ListNode current = this.head;
        while(i < index && current != null) {
            i++;
            current = current.getNext();
        }

        if (current != null && current.getNext() != null) { // prevent remove the tail
            if (current.getNext() ==  this.tail) { // current node before node to remove is a tail node
                this.tail = current; // point tail node to current node
            }
            current.setNext(current.getNext().getNext());
            return true;
        }
        return false;
    }

    // return an array of all values in the linked list, ordered from head to tail
    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode current = this.head.next; // skip dummy node
        while (current != null) {
            res.add(current.value);
            current = current.next;
        }
        return res;
    }
}

// A Singly Linked List Node
class ListNode {
    private int value;
    private ListNode next;

    public ListNode(int value) {
        this(value, null); // new node will not pointing anywhere
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }
    public ListNode getNext() {
        return next;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
}
