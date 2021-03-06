package Correct_Project1a_todo_1b.test;
import Correct_Project1a_todo_1b.*;
import org.junit.Assert;
import org.junit.Test;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    //测试字符串转化成字符链表
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        Assert.assertEquals("persiflage", actual);
    }
}
