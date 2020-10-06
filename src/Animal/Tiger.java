package Animal;

public class Tiger extends Animal implements Carnivore {
    public Tiger(String name, int movingSpeed, double weight) {
        super(name, movingSpeed, weight);
    }

    /**
     *
     * @param kgOfFood quantity of food in kg
     */
    public void eat(double kgOfFood) {
        this.gainWeight(kgOfFood * Math.PI / 5d);
    }


    /**
     *
     * @param animal
     * @return isDeadMeat
     */
    @Override
    public boolean attack(Animal animal) {
        boolean success = animal.getMovingSpeed() < this.getMovingSpeed();
        if(success) this.eat(animal.getWeight());
        return success;
    }
}