import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter the first number: ");
        num1 = reader.nextInt();

        System.out.println("Enter the second number: ");
        num2 = reader.nextInt();

        sum = num1 + num2;
        System.out.println("The sum is :" + sum);
    }
}