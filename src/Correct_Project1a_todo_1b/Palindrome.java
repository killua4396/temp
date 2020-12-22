package Correct_Project1a_todo_1b;

import java.util.Arrays;

public class Palindrome {
    public Deque<Character> wordToDeque(String word){
        Deque<Character> result = new ArrayDeque<>();
        char[] Chararray = word.toCharArray();
        for(int i=0;i<Chararray.length;i++){
            Character c = Character.valueOf(Chararray[i]);
            result.addLast(c);
        }
        return result;
    }
    public boolean isPalindrome(String word){
        if(word.length()==0||word.length()==1){
            return true;
        }
        Deque<Character> words = wordToDeque(word);
        char[] temp1 = new char[words.size()];
        char[] temp2 = new char[words.size()];
        for(int i=0;i<words.size();i++){
            char c  =  words.get(i).charValue();
            temp1[i] = c;
        }
        for(int i=words.size()-1;i>=0;i--){
            char c  =  words.get(i).charValue();
            temp2[words.size()-i-1] = c;
        }
        return Arrays.equals(temp1,temp2);
    }
    public boolean isPalindrome(String word , CharacterComparator cc){
        cc = new OffByOne();
        Deque<Character> words = wordToDeque(word);
        for(int i=0;i<words.size()/2;i++){
            if (!cc.equalChars(words.get(i),words.get(words.size()-1-i))){
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome(String word,CharacterComparator cc , int n){
        cc = new OffByN(n);
        Deque<Character> words = wordToDeque(word);
        for(int i=0;i<words.size()/2;i++){
            if (!cc.equalChars(words.get(i),words.get(words.size()-1-i))){
                return false;
            }
        }
        return true;
    }

}
