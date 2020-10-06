package Animal;

public abstract class Animal {
    private String name;
    private int movingSpeed;
    private double weight;

    public String getName()
    {
        return name;
    }
    public int getMovingSpeed()
    {
        return movingSpeed;
    }
    public double getWeight()
    {
        return weight;
    }

    /**
     *
     * @param name
     * @param movingSpeed speed at which an animal walks in km/h
     * @param weight weight in kg
     */
    public Animal(String name, int movingSpeed, double weight) {
        this.name = name;
        this.movingSpeed = movingSpeed;
        this.weight = weight;
    }

    /**
     *
     * @param minutes
     * @return km traveled
     */
    private double distanceTraveled(int minutes)
    {
        return movingSpeed * (minutes / 60d);
    }

    /**
     *
     * @param minutes
     */
    public double move(int minutes)
    {
        double kmWalked = distanceTraveled(minutes);
        this.loseWeight(weight * (0.01d * kmWalked));
        return kmWalked;
    }

    public abstract void eat(double kgOfFood);

    public void sleep(int hour)
    {
        this.loseWeight(weight * (0.01d * hour));
    }

    protected void gainWeight(double kg)
    {
        weight += kg;
    }

    protected void loseWeight(double kg)
    {
        weight -= kg;
        if(weight < 0) weight = 0;
    }
}
