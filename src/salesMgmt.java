import java.util.Scanner;

public class salesMgmt {
    public static void main(String[] args) {
        // Create arrays to store sales data
        String[] salesmanNames = new String[10];
        int[][] salesData = new int[10][5];

        // Read sales data from user input
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salesman name: ");
            salesmanNames[i] = scanner.nextLine();
            for (int j = 0; j < 5; j++) {
                System.out.printf("Enter sales for item %d: ", j+1);
                salesData[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // consume newline character
        }
        // Print sales report
        int grandTotal = 0;
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Name", "Item1", "Item2", "Item3", "Item4", "Item5", "TotalSales");
        System.out.println("___________________________________________________");
        for (int i = 0; i < 10; i++) {
            int totalSales = 0;
            System.out.printf("%-10s", salesmanNames[i]);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-10d", salesData[i][j]);
                totalSales += salesData[i][j];
            }
            System.out.printf("%-10d\n", totalSales);
            grandTotal += totalSales;
        }
        System.out.println("___________________________________________________");
        System.out.printf("%-10s%-10s\n", "GrandTotal\t", grandTotal);
    }
}
