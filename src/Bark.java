/**
 * Created by ARPITHA RAO on 15-01-2016.
 */

class Dog {
   private int weight;
    //String name;
 public int getWeight(){
     return weight;
 }
    public void setWeight(int w){
        weight = w;
    }
    int barking(int x) {
        while (x > 0) {
            if (getWeight() > 60) {
                System.out.println("Woof Woof");
            } else if (getWeight()> 14) {
                System.out.println("Ruff Ruff");
            } else {
                System.out.println("Yip Yip");
            }
            x = x-1;
        }
        return x;
    }
}


public class Bark {

    void newadd(){
        Bark b = new Bark();
        b.sum(19,785);

    }
    void sum(int a, int b){
        int c = a + b;
        System.out.print("Sum = "+c);
    }
    public static void main(String args[]){
        Dog one = new Dog();
        one.setWeight(70);
        Dog two = new Dog();
        two.setWeight(7);
        Dog three = new Dog();
        three.setWeight(18);

        one.barking(3);
        two.barking(3);
        three.barking(3);

        Bark exmp = new Bark();
        exmp.newadd();
    }

}
