package Correct_Project1a_todo_1b.test;
import Correct_Project1a_todo_1b.Palindrome;
import org.junit.Assert;

public class isPalindromeTest {
    public static void main(String[] args) {
        String a1 = "qwerewq";
        String a2 = "zxcjhjkasdq";
        String a3 = "a@b!12321!b@a";
        Palindrome p = new Palindrome();
        Assert.assertTrue(p.isPalindrome(a1));
        Assert.assertFalse(p.isPalindrome(a2));
        Assert.assertTrue(p.isPalindrome(a3));
    }
}
