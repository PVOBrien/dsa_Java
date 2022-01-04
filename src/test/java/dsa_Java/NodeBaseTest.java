package dsa_Java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Basic Nodes")
public class NodeBaseTest {

    NodeBase<?> newNode = new NodeBase<>(6);
    NodeBase<?> newNode2 = new NodeBase<>("String");

    @Test
    @DisplayName("test for int of nodeBase")
    void nodeBastTest() {
        assertEquals(6, newNode.getValue(), "Should be 6");
        assertEquals("String", newNode2.getValue(), "Should be \"String");
    }

    @Test
    @DisplayName("test for string of nodeBase")
    void nodeBastTest2() {
        assertEquals(6, newNode.getValue(), "Should be 6");
        assertEquals("String", newNode2.getValue(), "Should be \"String");
    }
}
