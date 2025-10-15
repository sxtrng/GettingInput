import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int posVal;

        System.out.print("Enter a Positive Integer: ");
        posVal = scanner.nextInt();

        if (posVal < 0) {
            System.out.println("That was a negative value.");
            posVal *= -1;
            System.out.println(posVal);
        } else {
            System.out.println(posVal);
        }

    }
}