import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void rightTurnTest1() {
        boolean actual = Task2.RightTurn("d4", "c6");
        Assert.assertTrue(actual);
    }

    @Test
    void rightTurnTest2() {
        boolean actual = Task2.RightTurn("d4", "c1");
        Assert.assertFalse(actual);
    }

    @Test
    void rightTurnTest3() {
        boolean actual = Task2.RightTurn("p4", "c1");
        Assert.assertFalse(actual);
    }

    @Test
    void rightTurnTest4() {
        boolean actual = Task2.RightTurn("a9", "c1");
        Assert.assertFalse(actual);
    }
}