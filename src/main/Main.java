import animals.Pet;
import animals.Cat;
import animals.Dog;

public class Main {

    public static void main(String[] args) {
        Pet jesse = new Pet("Jesse", 10, "Gray", "british", 7);
        Cat vasiliy = new Cat("Vasiliy", 15, "black", "homeless", 10);
        Dog balbes = new Dog("Balbes", 3, "brown", "homeless", 8);

        jesse.showInfo();
        jesse.makeSomeNoise();

        vasiliy.showInfo();
        vasiliy.makeSomeNoise();

        balbes.showInfo();
        balbes.makeSomeNoise();
    }
}
