import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        double hourlyRate;
        double hoursWorked;
        double grossPay;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Hello " + name + " ");
        System.out.print("Enter your hourly wage: ");
        hourlyRate = scanner.nextDouble();
        System.out.print("Enter hours worked: ");
        hoursWorked = scanner.nextDouble();
        grossPay = hourlyRate * hoursWorked;
        System.out.println("Thank you " + name);
        System.out.println("Your weekly gross pay is: " + grossPay);



    }
}