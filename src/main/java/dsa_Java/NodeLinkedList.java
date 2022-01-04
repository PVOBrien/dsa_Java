package dsa_Java;

public class NodeLinkedList<T> extends NodeBase<T>{
    private T valueBack;

    public NodeLinkedList(T value) { super(value); }
    public NodeLinkedList(T value, T valueBack) {
        super(value);
        this.valueBack = null;
    }

    public T getValueBack() { return valueBack; }

}
