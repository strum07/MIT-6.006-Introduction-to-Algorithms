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
    public void findPeakLinearArrayBruteForce_EmptyArray_ReturnsMinusOne(){
        int emptyArray[] = {};
        int actual = PeakFinding.findPeakLinearArrayBruteForce(emptyArray);
        int expected = -1;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void findPeakLinearArrayBruteForce_IncreasingArray_ReturnsPeakAsLastElement(){
        int increasingElements[] = {1, 2, 3, 4, 5, 6};
        int actual = PeakFinding.findPeakLinearArrayBruteForce(increasingElements);
        int expected = 6;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void findPeakLinearArrayBruteForce_DecreasingArray_ReturnsPeakAsFirstElement(){
        int decreasingElements[] = {6, 5, 4, 3, 2, 1};
        int actual = PeakFinding.findPeakLinearArrayBruteForce(decreasingElements);
        int expected = 6;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void findPeakLinearArrayBruteForce_UniformArray_ReturnsPeakAsSameElement(){
        int sameElements[] = {1, 1, 1, 1, 1, 1};
        int actual = PeakFinding.findPeakLinearArrayBruteForce(sameElements);
        int expected = 1;

        Assert.assertEquals(actual,expected);
    }
}
