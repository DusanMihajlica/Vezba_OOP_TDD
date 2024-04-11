import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void test() {
        Point test = new Point(6, 7);
        assertEquals(test.getX(), 6);
        assertEquals(test.getY(), 7);
    }
    @Test
    public void testSeter() {
        Point test = new Point();
        test.SetX(6);
        test.SetY(8);
        assertEquals(test.getX(), 6);
        assertEquals(test.getY(), 8);
    }
    @Test
    public void testPrazanKonstruktor() {
        Point test = new Point();
        assertNotEquals(test, null);
    }
    @Test
    public void testSelectable() {
        Point test = new Point(6,5,true);
        assertTrue(test.isSelectable());
        test.setSelectable(false);
        assertTrue(!test.isSelectable());
    }
    @Test
    public void testDeafult() {
        Point test = new Point();
        assertEquals(test.getX(), 5);
        assertEquals(test.getY(), 5);
        assertFalse(test.isSelectable());
    }
}
