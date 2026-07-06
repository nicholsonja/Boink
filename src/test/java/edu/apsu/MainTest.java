package edu.apsu;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(10, Main.add(3, 7));
    }
}