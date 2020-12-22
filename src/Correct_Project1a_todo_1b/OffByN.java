package Correct_Project1a_todo_1b;

public class OffByN implements CharacterComparator{
    int count;
    public OffByN(int N){
        count = N;
    }
    @Override
    public boolean equalChars(char x, char y ) {
        int n = x-y;
        return(n==count||n==-count);
    }
}
