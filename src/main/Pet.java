public class Pet {

    private String name;
    private String breed;
    private int age;
    private String color;
    private int weight;

    public Pet(String name, String breed, int age, String color, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void showPetInfo() {
        System.out.println("Ther's infromation about my pet: ");
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        System.out.println("weight: " + weight);
    }
}
