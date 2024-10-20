package animals;

public class Cat extends Pet{
    public Cat(String name, int age, String color, String breed, int weight) {
        super(name, age, color, breed, weight);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Meow");
    }
}
