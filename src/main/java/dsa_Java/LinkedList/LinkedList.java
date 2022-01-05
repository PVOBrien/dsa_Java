package dsa_Java.LinkedList;

public class LinkedList<T> {
    public NodeLinkedList<T> head;
    private NodeLinkedList<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public LinkedList(NodeLinkedList<T> head) { // overloaded
        this.head = head;
        this.tail = null;
    }

    // TODO: enqueue
    // TODO: dequeue

    public void setHead(NodeLinkedList<T> head) {
        this.head = head;
    }

    public NodeLinkedList<T> getHead() {
        return head;
    }
}
