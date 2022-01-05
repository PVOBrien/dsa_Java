package dsa_Java.LinkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("For LinkedLists")
public class LinkedListTests {

    LinkedList<Integer> testLL = new LinkedList<Integer>(new NodeLinkedList<Integer>(6));

    @Test
    @DisplayName("simple LinkedList, head value and null backvalue")
    public void LinkedListNullTest(){
        assertEquals(testLL.getHead().getValue(), 6);
        assertNull(testLL.getHead().getNodeBack());
    }
}
