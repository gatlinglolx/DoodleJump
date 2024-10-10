import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //FirstTask
        int score;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your score: ");
            score = scanner.nextInt();
            if (score >= 0 && score <= 100) {
                break;
            } else {
                System.out.println("Некорректное значение, попробуйте снова.");
            }
        }

        if (score >= 70) {
            System.out.println("Congrats you've passed!");
        } else {
            System.out.println("Sorry you've failed!");
        }

        //SecondTask
        String userInput = "";
        while (true) {
            if (userInput.isEmpty()) {
                System.out.println("Please enter smth: ");
                userInput = scanner.nextLine();
            }

            if (userInput.equals("exit")) {
                System.out.println("Exiting");
                break;
            }

            if (!userInput.isEmpty()) {
                System.out.println("You've entered: " + userInput);
            }
        }

        //ThirdTask
        System.out.println("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;

        if (x < 0) {
            System.out.println("Negative numbers are not allowed");
        }

        else {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
            System.out.printf("The sum of the bumbers from 0 to %d is %d", x, sum);
        }

        //FourthTask
        String[] channels = {"Russia 1", "Belarus 1", "NTV"};
        while (true) {
            System.out.println("Please enter the channel number (1 to 3 or 0 to exit): ");
            int channel = scanner.nextInt();

            if (channel == 0) {
                System.out.println("TV is shutting down");
                break;
            }

            if (channel >= 1 && channel < channels.length) {
                System.out.println(channels[channel - 1]);
            }
        }
    }
}
