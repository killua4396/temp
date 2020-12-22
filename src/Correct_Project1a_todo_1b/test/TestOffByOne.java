package Correct_Project1a_todo_1b.test;

import Correct_Project1a_todo_1b.OffByOne;
import org.junit.Assert;
import org.junit.Test;

public class TestOffByOne {
    /*
    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    static CharacterComparator offByOne = new OffByOne();

    // Your tests go here.
    Uncomment this class once you've created your CharacterComparator interface and OffByOne class. **/
    @Test
    public void TestOffone(){
        OffByOne ofo = new OffByOne();
        Assert.assertTrue(ofo.equalChars('a','b'));
        Assert.assertTrue(ofo.equalChars('k','j'));
        Assert.assertTrue(ofo.equalChars('%','&'));
        Assert.assertFalse(ofo.equalChars('a','a'));
        Assert.assertFalse(ofo.equalChars('a','g'));
        Assert.assertFalse(ofo.equalChars('*','#'));
    }
}
