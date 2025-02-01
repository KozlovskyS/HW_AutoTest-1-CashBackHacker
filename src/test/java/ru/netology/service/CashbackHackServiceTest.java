package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testIfLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testIfIdenticalBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testIfIdenticalMultipleBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2_000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testIfLessBoundaryMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testIfLessBoundaryMax() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_001;

        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testIfNegativeAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = -150;

        assertThrows(RuntimeException.class, () -> {
            service.remain(amount);
        });
    }
}

