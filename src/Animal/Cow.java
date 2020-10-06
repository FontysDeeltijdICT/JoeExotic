package Animal;

public class Cow extends Animal {
    public Cow(String name, int movingSpeed, double weight) {
        super(name, movingSpeed, weight);
    }

    /**
     *
     * @param kgOfFood quantity of food in kg
     */
    public void eat(double kgOfFood) {
        this.gainWeight(kgOfFood * 0.05d);
    }

}