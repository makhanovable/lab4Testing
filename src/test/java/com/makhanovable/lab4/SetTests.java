package com.makhanovable.lab4;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetTests {

    @Test
    void testToArray() {
        Set set = new Set();
        int[] array = set.toArray();

        assertEquals(0, array.length);
    }


    @Test
    void testInsert() {
        Set set = new Set();
        set.insert(1);
        set.insert(2);
        set.insert(3);

        assertEquals(3, set.toArray().length);

    }

    @Test
    void testMember() {
        Set set = new Set();

        int number = 3;
        set.insert(number);
        assertTrue(set.member(number));
    }

}
