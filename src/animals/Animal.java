package animals;

public class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void showInfo() {
        System.out.println("There's info about my pets:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }

    public void makeSomeNoise() {
        System.out.println("Animal sounds");
    }
}
