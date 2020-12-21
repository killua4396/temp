package HW0;

public class Exercise_1b {
    public static void drawTriangle(int n){
        int i = 1 ;
        while(i<n+1){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawTriangle(5);
    }
}
