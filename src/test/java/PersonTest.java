// PersonTest.java
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testTeenagerWithAge13() {
        boolean result = Person.isTeenager(13);
        assertTrue(result, "Expected true for age 13");
    }

    @Test
    public void testTeenagerWithAge19() {
        boolean result = Person.isTeenager(19);
        assertTrue(result, "Expected true for age 19");
    }

    @Test
    public void testNotTeenagerWithAge12() {
        boolean result = Person.isTeenager(12);
        assertFalse(result, "Expected false for age 12");
    }

    @Test
    public void testNotTeenagerWithAge20() {
        boolean result = Person.isTeenager(20);
        assertFalse(result, "Expected false for age 20");
    }

    @Test
    public void testTeenagerWithAge14() {
        boolean result = Person.isTeenager(14);
        assertTrue(result, "Expected true for age 14");
    }



}
