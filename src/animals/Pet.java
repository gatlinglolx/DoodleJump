package animals;

public class Pet extends Animal{
    private String breed;
    private int weight;

    public Pet(String name, int age, String color, String breed, int weight) {
        super(name, age, color);
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Pet sounds");
    }
}
