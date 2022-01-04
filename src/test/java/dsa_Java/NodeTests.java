package dsa_Java;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Nodes")
public class NodeTests {

    @Nested
    @DisplayName("Basic Nodes...")
    class BasicNodesTests {
        NodeBase<Integer> newNode = new NodeBase<>(6);
        NodeBase<String> newNode2 = new NodeBase<>("String");

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

    @Nested
    @DisplayName("NodeLinkedList")
    class LinkedListNodeTests {

        NodeLinkedList<String> newNodeLL = new NodeLinkedList<>("StringString!");

        @Test
        @DisplayName("For a Null backvalue of LinkedList")
        void nodeLLTest1() {
            assertEquals(newNodeLL.getValue(),"StringString!");
            assertNull(newNodeLL.getNodeBack());
        }

        @Test
        @DisplayName("Now with a real backValue")
        void nodeLLTest2() {
            newNodeLL.setNodeBack(new NodeLinkedList<>("backValue!!!"));
            assertEquals(newNodeLL.getNodeBack().getValue(), "backValue!!!", "should be ^^^ that");
        }

        @Test
        @DisplayName("Using overloaded constructor with both value and backValue")
        void nodeLLTest3(){
            NodeLinkedList<Integer> thisNLL = new NodeLinkedList<>(1, new NodeLinkedList<>(2));
            assertEquals(thisNLL.getValue(), 1, "One");
            assertEquals(thisNLL.getNodeBack().getValue(), 2, "Two");
        }
    }

}
