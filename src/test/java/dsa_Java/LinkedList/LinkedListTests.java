package dsa_Java.LinkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("For LinkedLists")
public class LinkedListTests {

    LinkedList<Integer> testLL = new LinkedList<>(new NodeLinkedList<>(6));
    LinkedList<String> testLLString = new LinkedList<>(new NodeLinkedList<>("NINE"));

    @Test
    @DisplayName("simple LinkedList, head value and null backvalue")
    public void LinkedListNullTest(){
        assertEquals(testLL.getHead().getValue(), 6);
        assertNull(testLL.getHead().getNodeBack());
    }
}
