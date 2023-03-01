import java.util.Objects;
import java.util.Scanner;

public class areaCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final int TRIANGLE = 1;
        final int RECTANGLE = 2;
        final int CIRCLE = 3;
        int choice,attempts=0;
        double base, height, length, breadth, radius, area;
        String answer = null;

        do {
            System.out.println("Enter 1 for triangle \nEnter 2 for rectangle \nEnter 3 for circle:");
            choice = reader.nextInt();

            switch (choice) {
                case TRIANGLE -> {
                    System.out.println("Enter value of base: ");
                    base = reader.nextDouble();
                    System.out.println("Enter value of height: ");
                    height = reader.nextDouble();
                    area = 0.5 * base * height;
                    System.out.println("Area of the triangle is: " + area + " sq.units");
                }
                case RECTANGLE -> {
                    System.out.println("Enter value of length: ");
                    length = reader.nextDouble();
                    System.out.println("Enter value of breadth: ");
                    breadth = reader.nextDouble();
                    area = length * breadth;
                    System.out.println("Area of the rectangle: " + area + " sq.units");
                }
                case CIRCLE -> {
                    System.out.println("Enter radius:");
                    radius = reader.nextDouble();
                    area = Math.PI * Math.pow(radius, 2);
                    System.out.println("Area of circle: " + area +" sq.units");
                }
                default -> {
                    attempts+=1;
                    if (attempts<=3){
                        System.out.println("Invalid choice, please try again.");
                        continue;
                    }
                    else{
                        break;
                    }

                }
            }
            System.out.println("Do you want to calculate another area for a figure? (Y/N)");
            answer = reader.next();
        } while ("Y".equalsIgnoreCase(Objects.requireNonNull(answer)) && attempts < 3);

        System.out.println("Program ended.");
    }
}



