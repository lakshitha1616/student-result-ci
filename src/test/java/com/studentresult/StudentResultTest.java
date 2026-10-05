package com.studentresult;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentResultTest {

    @Test
    void testCalculateTotal() {
        StudentResult student =
                new StudentResult("Lakshitha", 90, 80, 70);

        assertEquals(240, student.calculateTotal());
    }

    @Test
    void testCalculateAverage() {
        StudentResult student =
                new StudentResult("Lakshitha", 90, 80, 70);

        assertEquals(80.0, student.calculateAverage());
    }

    @Test
    void testCalculateGrade() {
        StudentResult student =
                new StudentResult("Lakshitha", 90, 80, 70);

        assertEquals("A", student.calculateGrade());
    }
}
