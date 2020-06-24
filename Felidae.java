package model;
import model.Animal;
public class Felidae extends Animal{
    public Felidae(int age, int weight, String running, String eating) {
        super(age, weight, running, eating);
    }

    public String uniqBehavior(){
        return "producing the meowing meowing sound";
    }
}
