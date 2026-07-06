package edu.apsu;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void add1() {
        assertEquals(10, Main.add(3, 7));
    }

    @org.junit.jupiter.api.Test
    void add2() {
        assertEquals(10, Main.add(7, 3));
    }
}