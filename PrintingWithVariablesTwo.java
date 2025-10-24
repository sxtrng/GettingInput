import java.util.Scanner;

public class PrintingWithVariablesTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double mass;
        double velocity;
        double momentum;
        String rho = "ρ";

        System.out.println("MOMENTUM IS THE PRODUCT OF MASS AND VELOCITY");
        System.out.println(rho + " =  m * v");


        System.out.print("Enter mass: ");
        mass = scanner.nextDouble();

        System.out.print("Enter velocity: ");
        velocity = scanner.nextDouble();

        momentum = mass * velocity;
        System.out.printf("Mass: %.2f * Velocity: %.2f equals %.2f\n", mass, velocity, momentum);

        scanner.close();
    }
}