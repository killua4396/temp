package Correct_Project1a_todo_1b.test;

import Correct_Project1a_todo_1b.OffByN;
import Correct_Project1a_todo_1b.OffByOne;
import org.junit.Assert;
import org.junit.Test;

public class TestOffByN {
    @Test
    public void TestOffBy_N(){
        OffByN obn = new OffByN(5);
        Assert.assertTrue(obn.equalChars('a','f'));
        Assert.assertTrue(obn.equalChars('f','a'));
        Assert.assertFalse(obn.equalChars('f','h'));
        Assert.assertFalse(obn.equalChars('a','z'));
    }
}
