package model;
import model.Felidae;
public class Tiger extends Felidae{
    public Tiger(int age, int weight, String running, String eating) {
        super(age, weight, running, eating);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger(3,50,"I can run","I eat the most");
        System.out.println(tiger.uniqBehavior());
    }
}
