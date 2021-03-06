import com.hillel.java.dataStructures.linkedList.LinkedCells;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mfarsikov on 17.04.2015.
 */
public class LinkedCellsTest {

    @Test
    public void emptyListTest() {
        LinkedCells list = new LinkedCells();
        assertEquals(list.toString(), "[]");
    }

    @Test
    public void toStringTest() {
        LinkedCells list = new LinkedCells();
        assertEquals("[]", list.toString());

        list.add("A");
        assertEquals("[A]", list.toString());

        list.add("B");
        list.add("C");
        assertEquals("[A, B, C]", list.toString());
    }

    @Test
    public void sizingTest() {
        LinkedCells list = new LinkedCells();
        assertEquals(0, list.size());

        list.add("A");
        assertEquals(1, list.size());
        list.add("B");
        list.add("C");
        assertEquals(3, list.size());
    }

    @Test
    public void equalityTest() {
        LinkedCells one = new LinkedCells();
        assertTrue("Not self equal", one.equals(one));

        LinkedCells other = new LinkedCells();
        assertTrue("Empty lists aren't equal", one.equals(other));

        one.add("A");
        assertFalse("Different lists are equal", one.equals(other));
        other.add("A");

        one.add("B");
        one.add("C");
        other.add("B");
        other.add("C");
        assertTrue("Not empty lists aren't equal", one.equals(other));
    }

    @Test
    public void getTest() {
        LinkedCells list = new LinkedCells();
        try {
            list.get(0);
            fail();
        } catch (IndexOutOfBoundsException e) {

        }
        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
        assertEquals("C", list.get(2));
    }
}
