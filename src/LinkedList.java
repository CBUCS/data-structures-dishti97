import java.util.List;

class LinkedList implements ListInterface {
    Node head;  // head of list
    public static void main(String args[]) {
        // create a linked list
        LinkedList ll = new LinkedList();

        // add elements to the linked list
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");


    }

    private void addLast(String z) {
    }

    @Override
    public boolean add(Object item) {
        return false;
    }

    @Override
    public boolean addAt(Object item, int position) {
        return false;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public boolean removeAt(int position) {
        return false;
    }

    @Override
    public boolean contains(Object item) {
        return false;
    }

    @Override
    public int numItems() {
        return 0;
    }

    @Override
    public Object grabAt(int position) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void print() {

    }

    @Override
    public boolean clear() {
        return false;
    }

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d;}
    }
}