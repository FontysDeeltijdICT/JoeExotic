import Animal.*;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow("Bertha", 4, 600);
        Tiger diego = new Tiger("Diego", 50, 200);

        cow.eat(10);
        diego.eat(10);

        cow.sleep(8);
        diego.sleep(8);


        displayStats(cow);
        displayStats(diego);

        if(diego.attack(cow))
        {
            System.out.println(cow.getName() + " is dead meat.");
            cow = null;
        }
        else
        {
            System.out.println(cow.getName() + " survived.");
        }

        displayStats(diego);
    }

    public static void displayStats(Animal animal)
    {
        System.out.println(animal.getName());
        System.out.println("speed: " + animal.getMovingSpeed());
        System.out.println("weight: " + animal.getWeight());
        System.out.println();
    }

}
