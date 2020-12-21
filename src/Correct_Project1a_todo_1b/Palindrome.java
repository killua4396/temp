package Correct_Project1a_todo_1b;

public class Palindrome {
    public Deque<Character> wordToDeque(String word){
        Deque<Character> result = new LinkedListDeque<>();
        char[] Chararray = word.toCharArray();
        for(int i=0;i<Chararray.length;i++){
            Character c = Character.valueOf(Chararray[i]);
            result.addLast(c);
        }
        return result;
    }
}
