package dsa_Java;

public class NodeLinkedList<T> extends NodeBase<T> {
    private NodeLinkedList<T> nodeBack;

    public NodeLinkedList(T value) {
        super(value);
        this.nodeBack = null;
    }

    public NodeLinkedList(T value, NodeLinkedList<T> nodeBack) {
        super(value);
        this.nodeBack = nodeBack;
    }

    public NodeLinkedList<T> getNodeBack() {
        return nodeBack;
    }
    public void setNodeBack(NodeLinkedList<T> nodeBack) {
        this.nodeBack = nodeBack;
    }

    @Override
    public String toString() { // TODO: work on this next
        return "NodeLinkedList{" + "nodeBack=" + nodeBack + '}';
    }
}
