import java.util.Scanner;

public class CreditWorthiness {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numCustomers = reader.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.print("Enter the credit limit: ");
            double creditLimit = reader.nextDouble();

            System.out.print("Enter the price of the item: ");
            double price = reader.nextDouble();

            System.out.print("Enter the quantity of the item: ");
            int quantity = reader.nextInt();

            double total = price * quantity;

            if (total > creditLimit) {
                System.out.println("Sorry you cannot purchase goods worthy such a value on credit");
            } else {
                System.out.printf("Thank you for purchasing from us. The value of the purchase is $%.2f\n", total);
            }
        }
    }
}