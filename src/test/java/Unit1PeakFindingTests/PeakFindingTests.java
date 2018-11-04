package Unit1PeakFindingTests;

import Unit1PeakFinding.PeakFinding;
import org.junit.Assert;
import org.junit.Test;

public class PeakFindingTests {
    @Test
    public void sampleTest(){
        Assert.assertEquals("Hey","Hey");
    }

    @Test
    public void findPeakLinear_EmptyArray_ReturnsMinusOne(){
        int emptyArray[] = {};
        int actual = PeakFinding.findPeakLinear(emptyArray);
        int expected = -1;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void findPeakLinear_IncreasingArray_ReturnsPeakAsLastElement(){
        int increasingElements[] = {1, 2, 3, 4, 5, 6};
        int actual = PeakFinding.findPeakLinear(increasingElements);
        int expected = 6;

        Assert.assertEquals(actual,expected);
    }

}
