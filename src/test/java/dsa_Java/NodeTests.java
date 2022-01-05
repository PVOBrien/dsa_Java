package dsa_Java;

import dsa_Java.LinkedList.NodeLinkedList;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Nodes")
public class NodeTests {

    @Nested
    @DisplayName("Basic Nodes...")
    class BasicNodesTests {
        NodeBase<Integer> newNode = new NodeBase<>(6);
        NodeBase<String> newNode2 = new NodeBase<>("This is String");

        @Test
        @DisplayName("test for int of nodeBase")
        void nodeBaseTest() {
            assertEquals(6, newNode.getValue(), "Should be 6");
            assertEquals("This is String", newNode2.getValue(), "Should be \"String");
        }

        @Test
        @DisplayName("test for string of nodeBase")
        void nodeBaseTest2() {
            assertEquals(6, newNode.getValue(), "Should be 6");
            assertEquals("This is String", newNode2.getValue(), "Should be \"String");
        }

        @Test
        @DisplayName("to String test, with int")
        void nodeBaseTest3() {
            assertEquals("NB { value= 6 }", newNode.toString());
        }

        @Test
        @DisplayName("to String test, with string")
        void nodeBaseTest4() {
            assertEquals("NB { value= This is String }", newNode2.toString());
        }
    }

    @Nested
    @DisplayName("NodeLinkedList")
    class LinkedListNodeTests {

        NodeLinkedList<String> newNodeLL = new NodeLinkedList<>("StringString!");
        NodeLinkedList<Integer> thisNLL = new NodeLinkedList<>(1, new NodeLinkedList<>(2));

        @Test
        @DisplayName("For a Null backvalue of LinkedList")
        void nodeLLTest1() {
            assertEquals(newNodeLL.getValue(), "StringString!");
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
        void nodeLLTest3() {
            assertEquals(thisNLL.getValue(), 1, "One");
            assertEquals(thisNLL.getNodeBack().getValue(), 2, "Two");
        }

        @Test
        @DisplayName("Node LinkedList toString with no nodeBack")
        void nodeLLTest4() {
            assertEquals(thisNLL.toString(), "NodeLL { value: 1 nodeBack { NodeLL { value: 2 nodeBack { null } }");
        }

        @Test
        @DisplayName("Node LinkedList toString with no nodeBack")
        void nodeLLTest5() {
            assertEquals(newNodeLL.toString(), "NodeLL { value: StringString! nodeBack { null }");
        }
    }

}
