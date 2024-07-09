package academy.learnprogramming.algorithm.bruteforce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BruteForceTest {

    BruteForce b = null;
    char[] array;


    @Before
    public void init() {
        b = new BruteForce();
        String s = new String("academy.learnprogramming");
        array = s.toCharArray();
    }

    @Test
    public void firstMatchtest() {
        Assert.assertEquals(0, b.firstMatch(array, new char[] {'a'}));
        Assert.assertEquals(16, b.firstMatch(array, new char[] {'g'}));
        Assert.assertEquals(22, b.firstMatch(array, new char[] {'n', 'g'}));
        Assert.assertEquals(6, b.firstMatch(array, new char[] {'y', '.', 'l', 'e'}));
        Assert.assertEquals(-1, b.firstMatch(array, new char[] {'z', 'z'}));
    }

    @Test
    public void everymatchTest() {
        int[] expect = new int[array.length];
        Arrays.fill(expect, -1);
        expect[0] = 7;

        System.out.println("expected: " + Arrays.toString(expect));
        int[] found = b.everyMatch(array, new char[] {'.'});
        System.out.println("found: " + Arrays.toString(found));

        Assert.assertArrayEquals(expect, found);

    }

}
