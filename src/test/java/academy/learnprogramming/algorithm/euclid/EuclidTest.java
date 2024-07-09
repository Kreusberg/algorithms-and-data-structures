package academy.learnprogramming.algorithm.euclid;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EuclidTest {

    Euclid e = null;

    @Before
    public void init() {
        e = new Euclid();
    }

    @Test
    public void gcdTest() {
        Assert.assertEquals(2, e.gcd(10, 2));
        Assert.assertEquals(2, e.gcd(22, 6));
        System.out.println(e.gcd(79, 32));
    }

    @Test
    public void gcd2Test() {
        Assert.assertEquals(2, e.gcd2(10, 2));
        Assert.assertEquals(2, e.gcd2(22, 6));
    }

    @Test
    public void gcdVersusGcd2Test() {
        Assert.assertEquals(e.gcd(10,2), e.gcd2(10, 2));
        Assert.assertEquals(e.gcd(22,6), e.gcd2(22, 6));
        Assert.assertEquals(e.gcd(182,74), e.gcd2(182, 74));
    }
}
