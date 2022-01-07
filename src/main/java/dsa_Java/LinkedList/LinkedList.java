package dsa_Java.LinkedList;

/**
 * @param <T> can only (or will only) be a NodeLinkedList<T>
 */
public class LinkedList<T> {
    private NodeLinkedList<T> head;
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
     * <br> Creates a basic head-and-tail LinkedList from the provided {@link dsa_Java.LinkedList.NodeLinkedList NodeLinkedList}.
     */
    public LinkedList(NodeLinkedList<T> newNode) {
        this.head = newNode;
        this.tail = newNode;
    }

    /**
     * Adds the value to the end of the LinkedList.
     *
     * @param value takes a T value and puts it into a {@link dsa_Java.LinkedList.NodeLinkedList NodeLinkedList}.
     */
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

    public void append(NodeLinkedList<T> nodeLinkedList) {
        if (head == null) {
            setHead(nodeLinkedList);
            setTail(nodeLinkedList);
        } else {
            getTail().setNodeBack(nodeLinkedList);
            setTail(nodeLinkedList);
        }
    }

    public NodeLinkedList<T> dequeue() {
        NodeLinkedList<T> toDeQ = getHead();
        setHead(getHead().getNodeBack());
        return toDeQ;
    }

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
