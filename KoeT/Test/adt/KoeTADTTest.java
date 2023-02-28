package adt;

import src.no.hvl.dat102.adt.KoeADT;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class KoeADTTest {
    private KoeADT<Integer> koe;

    @Before
    public void setUp() {
        koe = new KoeADT<Integer>();
    }

    @Test
    public void testInnKoe() {
        koe.innKoe(1);
        assertEquals(1, koe.foerste(), 0);
        koe.innKoe(2);
        assertEquals(2, koe.foerste(), 0);
    }

    @Test
    public void testUtKoe() {
        koe.innKoe(1);
        koe.innKoe(2);
        assertEquals(1, koe.utKoe(), 0);
        assertEquals(2, koe.utKoe(), 0);
    }

    @Test
    public void testFoerste() {
        koe.innKoe(1);
        koe.innKoe(2);
        assertEquals(1, koe.foerste(), 0);
        assertEquals(1, koe.foerste(), 0);
    }

    @Test
    public void testErTom() {
        assertTrue(koe.erTom());
        koe.innKoe(1);
        assertFalse(koe.erTom());
        koe.utKoe();
        assertTrue(koe.erTom());
    }

    @Test(expected = EmptyCollectionException.class)
    public void testUtKoeOnEmptyQueue() {
        koe.utKoe();
    }

    @Test(expected = EmptyCollectionException.class)
    public void testFoersteOnEmptyQueue() {
        koe.foerste();
    }
}