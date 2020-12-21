package First_Week;

public class Dog {
    public int weight;

    public Dog(int w){
        this.weight = w;
    }

    public void makeNoise(){
        if(weight<10){
            System.out.println("yip!");
        }
        else if(weight<30){
            System.out.println("bark!");
        }
        else{
            System.out.println("wooof!");
        }
    }
}
