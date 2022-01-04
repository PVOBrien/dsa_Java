package dsa_Java;

/**
 *
 * A simple node to be extended for other data structures.
 *
 * @param <T> a generic type to allow for the node to hold any type.
 * @author Paul O'Brien
 *
 */

public class NodeBase<T> {
    private T value;

    public NodeBase(T value) {
        this.value = value;
    }

    public T getValue() { return value; }
    public void setValue(T value) { this.value = value; }

    @Override
    public String toString() {
        return String.format("NB { value= %s }", value);
//        return "NB{" + "value=" + value + '}';
    }
}