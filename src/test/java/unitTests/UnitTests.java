package unitTests;

import methodsForUnitTests.MethodsForUnitTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UnitTests {
    @Test
    public void testHarmonicCalculation() {
        // Arrange
        MethodsForUnitTests methods = new MethodsForUnitTests();
        // Act
        double result = methods.calcGeneralizedHarmonics(2, 2);
        // Assert
        Assert.assertEquals(result, 1.25);
    }

    @Test
    public void testStringConcatenation() {
        String first = "First";
        String second = "Second";
        String expected = "FirstSecond";
        MethodsForUnitTests methods = new MethodsForUnitTests();
        String actual = methods.concatStrings(first, second);

        if ((actual.equals(expected))) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
    }

    @Test
    public void testStringReverse() {
        String string = "abcdefg";
        MethodsForUnitTests methods = new MethodsForUnitTests();
        String reverse = methods.reverseString(string);

        Assert.assertEquals(reverse, "gfedcba");
    }

    @DataProvider(name = "Sum")
    public Object[][] createData() {
        return new Object[][] {
                {3, 3, 6},
                {2, 8, 10},
                {10, 12, 22}
        };
    }

    @Test(dataProvider = "Sum")
    public void test_Sum(int a, int b, int c) {
        Assert.assertEquals(a + b, c);
    }
}
