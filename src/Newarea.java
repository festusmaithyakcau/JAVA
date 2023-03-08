import java.util.Scanner;

public class Newarea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int attempts = 0;
        double area = 0.0;

        while (attempts < 3 && area == 0.0) {
            System.out.println("Please select the shape for which you want to calculate the area:");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.print("Enter your choice (1-3): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the base of the triangle: ");
                    double base = input.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = input.nextDouble();
                    area = 0.5 * base * height;
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = input.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = input.nextDouble();
                    area = length * width;
                    break;

                case 3:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = input.nextDouble();
                    area = Math.PI * radius * radius;
                    break;

                default:
                    attempts++;
                    if (attempts < 3) {
                        System.out.println("Invalid choice, please try again.");
                    }
                    break;
            }
        }

        if (area > 0) {
            System.out.println("The area is: " + area + " sq.units");
        } else {
            System.out.println("Too many invalid attempts. Exiting program.");
        }

        input.close();
    }
}
