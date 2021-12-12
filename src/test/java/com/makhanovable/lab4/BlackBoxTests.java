package com.makhanovable.lab4;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BlackBoxTests {

    @Test
    void testWorkScheduleConstructor() {
        // test negative size
        int size = -1;
		Exception thrown = assertThrows(
				Exception.class,
				() -> new WorkSchedule(size),
				"Exception"
		);

		assertTrue(thrown instanceof NegativeArraySizeException);
    }


    @Test
    void testReadSchedule() {
        int size = 12;
        WorkSchedule workSchedule = new WorkSchedule(size);
        assertNotNull(workSchedule.readSchedule(11));
    }

    @Test
    void testSetRequiredNumber() {
        int size = 12;
        int expected = 33;
        WorkSchedule workSchedule = new WorkSchedule(size);
        workSchedule.setRequiredNumber(expected, 0, 11);

        assertEquals(expected, workSchedule.readSchedule(11).requiredNumber);
    }

    @Test
    void testAddWorkingPeriod() {

    }

    @Test
    void testWorkingEmployees() {

    }

    @Test
    void testNextIncomplete() {

    }

}
