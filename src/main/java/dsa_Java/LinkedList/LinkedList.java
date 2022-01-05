package dsa_Java.LinkedList;

/**
 * @param <T> can only (or will only) be a NodeLinkedList<T>
 */
public class LinkedList<T> {
    public NodeLinkedList<T> head;
    private NodeLinkedList<T> tail;

    /**
     * creates an empty LinkedList. Can use {@link #append append} method to build it out.
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Overloaded constructor method.
     * <br> Creates a basic head-and-tail linkedlist from the provided NodeLinkedList node.
     */
    public LinkedList(NodeLinkedList<T> newNode) {
        this.head = newNode;
        this.tail = newNode;
    }

    public void append(T value) {
        NodeLinkedList<T> nodeLinkedList = new NodeLinkedList<>(value);
        if (head == null) {
            setHead(nodeLinkedList);
            setTail(nodeLinkedList);
        } else {
            getTail().setNodeBack(nodeLinkedList);
            setTail(nodeLinkedList);
        }
    }
    // TODO: dequeue

    public void setHead(NodeLinkedList<T> head) {
        this.head = head;
    }

    public NodeLinkedList<T> getHead() {
        return head;
    }

    public NodeLinkedList<T> getTail() {
        return tail;
    }

    public void setTail(NodeLinkedList<T> tail) {
        this.tail = tail;
    }
}
