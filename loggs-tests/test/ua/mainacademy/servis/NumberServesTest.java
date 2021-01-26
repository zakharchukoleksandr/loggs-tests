package ua.mainacademy.servis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServesTest {

    @Test
    void getSum() {
        int result=NumberServes.getSum(12345);
        assertEquals(15, result);
    }
}