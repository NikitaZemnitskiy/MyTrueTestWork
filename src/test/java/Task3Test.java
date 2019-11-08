import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void areaOfATriangleTest1() {
        Double actual = Task3.AreaOfATriangle(1,1,1,1,1,1);
        Double expected = -1.0;
        Assert.assertEquals(expected, actual);
    }
    @Test
    void areaOfATriangleTest2() {
        Double actual = Task3.AreaOfATriangle(1,1,2,5,5,3);
        Double expected = 3.000000000000001;
        Assert.assertEquals(expected, actual);
    }
}