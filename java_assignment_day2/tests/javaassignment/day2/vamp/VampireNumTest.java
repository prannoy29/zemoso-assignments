package javaassignment.day2.vamp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Prannoy Sarkar
 */
public class VampireNumTest {
    VampireNum vntest = new VampireNum();
    @Test
    public void digitLength() throws Exception {
        assertEquals(2,vntest.digitLength(10));
        assertEquals(4,vntest.digitLength(4389));
        assertEquals(3,vntest.digitLength(474));
    }

    @Test
    public void isVampire() throws Exception {
        assertTrue(vntest.isVampire(21,60,1260));
        assertTrue(vntest.isVampire(15,30,1350));
        assertTrue(vntest.isVampire(300,501,150300));
        assertFalse(vntest.isVampire(21,60,1250));
        assertFalse(vntest.isVampire(23,6440,224406));
        assertFalse(vntest.isVampire(544,10,54411));
    }

    @Test
    public void sortDigits() throws Exception {
        assertEquals(1234,vntest.sortDigits(3241));
        assertEquals(5789,vntest.sortDigits(8597));
    }
}