package Correct_Project1a_todo_1b.test;
import Correct_Project1a_todo_1b.CharacterComparator;
import Correct_Project1a_todo_1b.OffByOne;
import Correct_Project1a_todo_1b.Palindrome;
import org.junit.Assert;
import org.junit.Test;

public class isPalindromeTest {
    @Test
    public void isPalindromme_Test(){
        String a1 = "qwerewq";
        String a2 = "zxcjhjkasdq";
        String a3 = "a@b!12321!b@a";
        Palindrome p = new Palindrome();
        Assert.assertTrue(p.isPalindrome(a1));
        Assert.assertFalse(p.isPalindrome(a2));
        Assert.assertTrue(p.isPalindrome(a3));
    }
    @Test
    public void isPalindromme_OffByOne_Test(){
        Palindrome p = new Palindrome();
        String a1 ="alj3kmb";
        Assert.assertTrue(p.isPalindrome(a1,new OffByOne()));
    }
}
