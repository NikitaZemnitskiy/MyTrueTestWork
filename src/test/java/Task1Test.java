import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void uniqueCharactersTest1() {
        int [] arr = new int[] {1, 4, 5, 1, 1, 3};
        int actual = Task1.uniqueCharacters(arr);
        int expected  = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void uniqueCharactersTest2() {
        int [] arr = new int[] {-1, 4, 5, 1, 1, 3};
        int actual = Task1.uniqueCharacters(arr);
        int expected  = 5;
        Assert.assertEquals(expected, actual);

    }
    @Test
    void uniqueCharactersTest3() {
        int [] arr = new int[] {-1, -4, -5, 1, 1, 3};
        int actual = Task1.uniqueCharacters(arr);
        int expected  = 5;
        Assert.assertEquals(expected, actual);

    }

    @Test
    void uniqueCharactersTest6() {
        int [] arr = new int[] {1, 1, 1, 1, 1, 1};
        int actual = Task1.uniqueCharacters(arr);
        int expected  = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    void uniqueCharactersTestEmptyArray() {
        int [] arr = new int[] {};
        int actual = Task1.uniqueCharacters(arr);
        int expected  = 0;
        Assert.assertEquals(expected, actual);

    }

    @Test
    void uniqueCharactersTestZero() {
        int [] arr = new int[] {0};
        int actual = Task1.uniqueCharacters(arr);
        int expected  = 1;
        Assert.assertEquals(expected, actual);

    }
}