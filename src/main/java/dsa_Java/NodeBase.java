package dsa_Java;

public class NodeBase<T> {
    private T value;

    public NodeBase(T value) {
        this.value = value;
    }

    public T getValue() { return value; }
    public void setValue(T value) { this.value = value; }
}
