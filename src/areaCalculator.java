import java.util.Objects;
import java.util.Scanner;

public class areaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TRIANGLE = 1;
        final int RECTANGLE = 2;
        final int CIRCLE = 3;
        int choice;
        double base, height, length, width, radius, area;
        String answer = null;

        do {
            System.out.println("Enter 1 for triangle, 2 for rectangle, or 3 for circle:");
            choice = input.nextInt();

            switch (choice) {
                case TRIANGLE -> {
                    System.out.println("Enter base and height:");
                    base = input.nextDouble();
                    height = input.nextDouble();
                    area = 0.5 * base * height;
                    System.out.println("Area of triangle: " + area);
                }
                case RECTANGLE -> {
                    System.out.println("Enter length and width:");
                    length = input.nextDouble();
                    width = input.nextDouble();
                    area = length * width;
                    System.out.println("Area of rectangle: " + area);
                }
                case CIRCLE -> {
                    System.out.println("Enter radius:");
                    radius = input.nextDouble();
                    area = Math.PI * Math.pow(radius, 2);
                    System.out.println("Area of circle: " + area);
                }
                default -> {
                    System.out.println("Invalid choice, please try again.");
                    continue;
                }
            }
            System.out.println("Do you want to calculate another area? (y/n)");
            answer = input.next();
        } while (Objects.requireNonNull(answer).equalsIgnoreCase("y"));

        System.out.println("Program terminated.");
    }
}



