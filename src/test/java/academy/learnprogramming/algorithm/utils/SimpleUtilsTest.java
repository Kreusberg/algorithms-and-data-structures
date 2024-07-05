package academy.learnprogramming.algorithm.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleUtilsTest {

    SimplesUtils utils = null;

    // executes before any test
    @Before
    public void init() {
        utils = new SimplesUtils();
    }

    @Test
    public void stringToBooleanTrueTest() {
        Assert.assertTrue(utils.stringToBoolean("y"));
        Assert.assertTrue(utils.stringToBoolean("Y"));
        Assert.assertTrue(utils.stringToBoolean("yEs"));
        Assert.assertTrue(utils.stringToBoolean("YES"));
        Assert.assertTrue(utils.stringToBoolean("true"));
    }

    @Test
    public void stringToBooleanFlaseTest() {
        Assert.assertFalse(utils.stringToBoolean("n"));
        Assert.assertFalse(utils.stringToBoolean("N"));
        Assert.assertFalse(utils.stringToBoolean("no"));
        Assert.assertFalse(utils.stringToBoolean("NO"));
        Assert.assertFalse(utils.stringToBoolean("false"));
        Assert.assertFalse(utils.stringToBoolean("zero"));
        Assert.assertFalse(utils.stringToBoolean(null));
    }

    @Test
    public void getFileTypeByCode() {
        Assert.assertEquals(SimplesUtils.FileType.PDF, utils.getFileTypeByCode(3));
        Assert.assertEquals(SimplesUtils.FileType.JPEG, utils.getFileTypeByCode(1));
        Assert.assertNull(utils.getFileTypeByCode(999));
    }

    @Test
    public void getFileTypeByName() {
        Assert.assertEquals(SimplesUtils.FileType.TEXT, utils.getFileTypeByName("txt"));
        Assert.assertNull(utils.getFileTypeByName("zero"));
        Assert.assertNull(utils.getFileTypeByName(null));
    }
}
