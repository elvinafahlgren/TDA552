import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ARSetTest {
    /** The empty set should have size 0.
     *  If I add the integer 7 to the empty set, then it should contain 7.
     *  The empty set should not contain 7.
     *  If I add the integer 7 to the empty set, it should have size 1.
     *  If I add the integer 7 to the empty set, it should not contain 6.
     */
    private ARSet set;

    @Before
    public void init(){
        set = new ARSet();
        set.add(7);
        set.add(7);
    }

    @Test
    public void emptySetSize() {
        assertEquals(0, new ARSet().size());
    }

    @Test
    public void oneElementSet() {
        assertTrue(set.contains(7));
    }

    @Test
    public void emptySetIsEmpty() {
        assertFalse(new ARSet().contains(7));
    }

    @Test
    public void addSizeSet(){
        ARSet set = new ARSet();
        int size = set.size();
        set.add(10);
        assertTrue(size < set.size());
    }

    @Test
    public void twoIdenticalElementsSet(){
        assertTrue(set.size() == 1);
    }

    @Test
    public void deleteElementSet(){
        set.delete(7);
        assertFalse(set.contains(7));
    }

    @Test
    public void addDublicateIntegerArray(){
        set.add(new Integer[]{7});

        assertEquals(1, set.size());
    }

    @Test
    public void addIntegerArray(){
        set.add(new Integer[]{8});

        assertEquals(2, set.size());
    }


    @Test
    public void twoEqualSets(){
        ARSet set2 = new ARSet();
        set2.add(7);

        assertTrue(set.equals(set2));
    }

    @Test
    public void twoNotEqualSets(){
        ARSet set2 = new ARSet();

        assertFalse(set.equals(set2));
    }



    @Test
    public void oneElementUnionSet(){
        ARSet set2 = new ARSet();
        set2.add(9);

        ARSet set3 = new ARSet();
        set3.add(7);
        set3.add(9);

        assertEquals(set3, set.union(set2));
    }

}
