package animals;

public class Dog extends Pet{
    public Dog(String name, int age, String color, String breed, int weight) {
        super(name, age, color, breed, weight);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Bark");
    }
}
