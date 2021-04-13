import task2.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class PointTest {
    @Test
    public void testPoint() {
        Point p1 = new Point(8,12);
        Point p2 = new Point(6, 3);
        Assertions.assertEquals(p1.distance(p1, p2), 9.219544457292887);
    }
}
