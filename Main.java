import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("What is your age?");
        int age = -1;
        do {
            try {
                age = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                System.out.println(e.getMessage());
                scan.nextLine();
                System.out.println("What is your age?");
            }


        }while (age == -1);
        System.out.println("You are " + age + " years old.");
    }

}
