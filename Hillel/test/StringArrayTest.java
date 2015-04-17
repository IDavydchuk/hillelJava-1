import com.hillel.java.dataStructures.ArrayList.StringArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Mfarsikov on 17.04.2015.
 */
public class StringArrayTest {

    @Test
    public void sizeTest() {
        StringArray array = new StringArray();
        assertEquals(array.size(), 0);

        array.add("A");
        assertEquals(array.size(), 1);

        array.add("B");
        array.add("C");
        assertEquals(array.size(), 3);
    }

    @Test
    public void toStringTest() {
        StringArray array = new StringArray();
        assertEquals("[]", array.toString());
        array.add("A");
        assertEquals("[A]", array.toString());

        array.add("B");
        array.add("C");
        assertEquals("[A, B, C]", array.toString());
    }

    @Test
    public void equalityTest() {
        StringArray one = new StringArray();
        assertTrue("Not self equal", one.equals(one));

        StringArray other = new StringArray();
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
}
