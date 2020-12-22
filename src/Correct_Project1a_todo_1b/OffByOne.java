package Correct_Project1a_todo_1b;

public class OffByOne implements CharacterComparator{
    @Override
    public boolean equalChars(char x, char y) {
        int judge = x-y;
        return (judge == 1 ||judge == -1);
    }
}
