package main;

import animals.Pet;
import animals.Cat;
import animals.Dog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    private static List<Pet> pets = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadPets();
        pets.add(new Pet("Jesse", 10, "Gray", "british", 7));
        pets.add(new Cat("Vasiliy", 15, "black", "homeless", 10));
        pets.add(new Dog("Balbes", 3, "brown", "homeless", 8));

        boolean running = true;
        while (running) {
            System.out.println("\nMenu");
            System.out.println("1. Show all pets");
            System.out.println("2. Add new pet");
            System.out.println("3. Exit");
            System.out.println("Choose action: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    showPets();
                    break;
                case 2:
                    addPet();
                    break;
                case 3:
                    savePets();
                    running = false;
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Incorrect choice. Please try again");
            }
        }
    }

    private static void showPets() {
        for (Pet pet: pets) {
            pet.showInfo();
            pet.makeSomeNoise();
        }
    }

    private static void addPet() {
        System.out.print("Enter pet type (Cat/Dog): ");
        String type = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        System.out.print("Enter breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter weight: ");
        int weight = scanner.nextInt();
        scanner.nextLine();

        Pet newPet;
        if (type.equalsIgnoreCase("Cat")) {
            newPet = new Cat(name, age, color, breed, weight);
        } else if (type.equalsIgnoreCase("Dog")) {
            newPet = new Dog(name, age, color, breed, weight);
        } else {
            System.out.println("Incorrect pet type");
            return;
        }

        pets.add(newPet);
        System.out.println("Pet has been added");
    }

    private static void loadPets() {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream("src/config.properties")) {
            properties.load(input);
            for (String key : properties.stringPropertyNames()) {
                String[] values = properties.getProperty(key).split(",");
                String name = values[0];
                int age = Integer.parseInt(values[1]);
                String color = values[2];
                String breed = values[3];
                int weight = Integer.parseInt(values[4]);

                Pet pet = key.startsWith("Cat") ? new Cat(name, age, color, breed, weight) : new Dog(name, age, color, breed, weight);
                pets.add(pet);
            }
        } catch (IOException e) {
            System.out.println("Pets not loaded: " + e.getMessage());
        }
    }

    private static void savePets() {
        Properties properties = new Properties();
        for (Pet pet : pets) {
            properties.put(pet.getClass().getSimpleName() + "_" + pet.getName(), pet.toPropertiesString());
        }

        try (OutputStream output = new FileOutputStream("src/config.properties")) {
                properties.store(output, null);
                System.out.println("Pets saved");
        } catch (IOException e) {
                System.out.println("Pets not saved" + e.getMessage());
        }
    }

    public static int summary(int a, int b) {
        if (b > 0 && a > Integer.MAX_VALUE - b) {
            throw new ArithmeticException("Integer overflow");
        }
        return a + b;
    }
}
