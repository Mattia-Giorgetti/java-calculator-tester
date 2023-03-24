package org.lessons.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {

    private StringList testingList;

    @BeforeEach
    void listInit(){
        testingList = new StringList();
    }

    @Test
    @DisplayName("Test metodo add()")
    void add() {
        testingList.add("Prova1");
        testingList.add("Prova2");
        testingList.add("Prova3");
        testingList.add("Prova4");
        testingList.add("Prova5");
        testingList.add("Prova6");
        testingList.add("Prova7");
        assertEquals(7, testingList.size());
    }

    @Test
    @DisplayName("Test metodo size()")
    void size() {
        assertEquals(0,testingList.size());
        testingList.add("Prova");
        assertTrue(testingList.size() == 1);
    }

    @Test
    @DisplayName("Test metodo clear()")
    void clear() {
        testingList.add("Prova");
        testingList.add("Prova2");
        testingList.clear();
        assertEquals(0,testingList.size());
    }

    @Test
    @DisplayName("Test metodo remove()")
    void remove() {
        testingList.add("Prova1");
        testingList.add("Prova2");
        assertEquals(2,testingList.size());
        testingList.remove(1);
        assertEquals(1,testingList.size());
        assertThrows(IndexOutOfBoundsException.class, () -> testingList.remove(-1));
    }

    @Test
    @DisplayName("Test metodo get()")
    void get() {
        testingList.add("Prova");
        assertEquals("Prova", testingList.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> testingList.get(4));
    }
}