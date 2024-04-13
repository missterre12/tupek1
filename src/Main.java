import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int menu = 0;

        do {
            System.out.println("====== Our Menu ======");
            System.out.println("1. Identity");
            System.out.println("2. Calculator");
            System.out.println("3. Comparison");
            System.out.println("99. Exit");
            System.out.println("");

            System.out.print("Enter your chosen number: ");

            try {
                menu = scanner.nextInt();
            } catch (InputMismatchException e) {
                String dump = scanner.nextLine();
                menu = 1;
            }
            if (menu == 1) {
                System.out.println("1. My name is Terresa Alicia");
                System.out.println("2. Backend is incredible thing.");
                System.out.println("3. I hope on September 2024, I'll get my first full time job.");
            } else if (menu == 2) {
                System.out.println("====== Calculator ======");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Modulo");
                System.out.println("");

                System.out.print("Enter your chosen number: ");
                int menuCalculator = scanner.nextInt();

                System.out.print("Enter your first number: ");
                int firstNumber = scanner.nextInt();
                System.out.print("Enter your second number: ");
                int secondNumber = scanner.nextInt();

                switch (menuCalculator) {
                    case 1:
                        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                        break;
                    case 2:
                        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                        break;
                    case 3:
                        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                        break;
                    case 4:
                        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                        break;
                    case 5:
                        System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
                        break;
                    default:
                        System.out.println("Please enter the following number on the menu!");
                        break;
                }
            } else if (menu == 3) {
                System.out.println("====== Comparison ======");
                System.out.print("Enter your first number: ");
                int firstNumber = scanner.nextInt();
                System.out.print("Enter your second number: ");
                int secondNumber = scanner.nextInt();

                if (firstNumber > secondNumber) {
                    System.out.println(firstNumber + " > " + secondNumber);
                } else if (firstNumber < secondNumber) {
                    System.out.println(firstNumber + " < " + secondNumber);
                } else {
                    System.out.println(firstNumber + " = " + secondNumber);
                }
            } else if (menu == 99) {
                System.out.println("Program Finished!");
            } else {
                System.out.println("You enter the wrong menu's number!");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        } while (menu != 99);
    }
}
