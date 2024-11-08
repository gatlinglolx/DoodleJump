package unit_tests;

import animals.Cat;
import animals.Pet;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.Main;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class SomeTests {
    private void simulateInput(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test(groups = {"positive"})
    public void testSummaryPositiveNumbers() {
        Assert.assertEquals(Main.summary(10, 5), 15);
    }

    @Test(groups = {"positive"})
    public void testSummaryNegativeNumbers() {
        Assert.assertEquals(Main.summary(-10, -5), -15);
    }

    @Test(groups = {"negative"}, expectedExceptions = ArithmeticException.class)
    public void testSummaryOverflow() {
        int result = Main.summary(Integer.MAX_VALUE, 1);
    }

    @Test(groups = {"negative"})
    public void testSummaryWithNegativeValues() {
        Assert.assertNotEquals(Main.summary(-1, -1), 1);
    }

}
