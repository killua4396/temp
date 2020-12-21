package List;


import org.junit.Assert;
import org.junit.Test;

public class TestSort {
    @Test
    public void TestFindSmallst(){
        String[] input = {"i","have","an","egg"};
        int FindSmallstExpect = 2;
        int actual = Sort.findSmallest(input,0);
        Assert.assertEquals(FindSmallstExpect,actual);
    }

    @Test
    public void TestSwap(){
        String[] input = {"i","have","an","egg"};
        String[] expected = {"an","have","i","egg"};
        Sort.swap(input,0,2);
        Assert.assertArrayEquals(input,expected);
    }

    @Test
    public void TestSort(){
        String[] input = {"i","have","an","egg"};
        String[] expected = {"an","egg","have","i"};
        Sort.sort(input);
        Assert.assertArrayEquals(input,expected);
    }
}
