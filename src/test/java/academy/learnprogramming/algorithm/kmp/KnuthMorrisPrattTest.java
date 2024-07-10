package academy.learnprogramming.algorithm.kmp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class KnuthMorrisPrattTest {


    KnuthMorrisPratt kmp = null;

    @Before
    public void init() {
        kmp = new KnuthMorrisPratt();
    }

    @Test
    public void searchTest() {
        String array = "abazacabababac";
        String pattern = "ababac";
        int index = kmp.search(array.toCharArray(), pattern.toCharArray());

        Assert.assertEquals(8, index);
    }

    @Test
    public void searchTest2() {
        String array = "aabaaabacaz";
        String pattern = "aabacaz";
        int index = kmp.search(array.toCharArray(), pattern.toCharArray());

        Assert.assertEquals(4, index);
    }

    @Test
    public void searchTest3() {
        String array = "this is a test";
        String pattern = "is a ";
        int index = kmp.search(array.toCharArray(), pattern.toCharArray());

        Assert.assertEquals(5, index);
    }

    @Test
    public void searchTest4() {
        String array = "cantfindtheindex";
        String pattern = "foo";
        int index = kmp.search(array.toCharArray(), pattern.toCharArray());

        Assert.assertEquals(-1, index);
    }

    @Test
    public void computeLSPTableTest() {

        int[] actual = kmp.computeLSPTable(new char[] {'a', 'b', 'a', 'b', 'a', 'c'});
        int[] expect = new int[] {0, 0, 1, 2, 3, 0};

        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void computeLSPTableTest2() {

        int[] actual = kmp.computeLSPTable(new char[] {'a', 'a', 'b', 'a', 'c'});
        int[] expect = new int[] {0, 1, 0, 1, 0};

        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void computeLSPTableTest3() {

        int[] actual = kmp.computeLSPTable(new char[] {'a', 'b', 'c', 'd', 'a', 'b', 'c', 'a'});
        int[] expect = new int[] {0, 0, 0, 0, 1, 2, 3, 1};

        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void computeLSPTableTest4() {

        int[] actual = kmp.computeLSPTable(new char[] {'c', 'f', 'g', 'c', 'f', 'a'});
        int[] expect = new int[] {0, 0, 0, 1, 2, 0};

        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void computeLSPTableTest5() {

        int[] actual = kmp.computeLSPTable(new char[] {'a', 'a', 'b', 'a', 'c', 'a', 'z'});
        int[] expect = new int[] {0, 1, 0, 1, 0, 1, 0};

        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void computeLSPTableTest6() {

        int[] actual = kmp.computeLSPTable(new char[] {'a', 'a'});
        int[] expect = new int[] {0, 1};

        Assert.assertArrayEquals(expect, actual);
    }

    @Test
    public void computeLSPTableTest7() {

        int[] actual = kmp.computeLSPTable(new char[] {'a', 'b'});
        int[] expect = new int[] {0, 0};

        Assert.assertArrayEquals(expect, actual);
    }
}
