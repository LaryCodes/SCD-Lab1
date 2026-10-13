import java.util.Scanner;

public class GreetingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("Greetings from Java!");

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Nice to meet you, " + name + "!");

        scanner.close();
    }
}
