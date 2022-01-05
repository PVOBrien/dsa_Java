package dsa_Java.LinkedList;

import dsa_Java.NodeBase;

/** @param <T> for nodeBase already discussed in {@link dsa_Java.NodeBase }. */
public class NodeLinkedList<T> extends NodeBase<T> {
    private NodeLinkedList<T> nodeBack;

    /** @param value invokes the NodeBase's constructor, also includes an empty nodeback reference. */
    public NodeLinkedList(T value) {
        super(value);
        this.nodeBack = null;
    }

    /**
     * @param value NodeBase's value
     * @param nodeBack references an actual referred-to nodeLL.
     */
    public NodeLinkedList(T value, NodeLinkedList<T> nodeBack) {
        super(value);
        this.nodeBack = nodeBack;
    }

    /** @return returns the nodeLL's back node. */
    public NodeLinkedList<T> getNodeBack() { return nodeBack; }

    /** @param nodeBack sets a nodeBack reference onto the nodeLL. */
    public void setNodeBack(NodeLinkedList<T> nodeBack) { this.nodeBack = nodeBack; }

    @Override
    public String toString() { // TODO: work on this next
        return "NodeLL { value: " + this.getValue() + " nodeBack { " + nodeBack + " }";
    }
}
