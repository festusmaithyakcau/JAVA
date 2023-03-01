import java.util.Scanner;
public class computerGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of rounds you wish to play: ");
        int rounds = reader.nextInt();

        int secretNumber = 7; // You can change this to any secret number you like
        int totalScore = 0;

        for (int i = 1; i <= rounds; i++) {
            System.out.printf("Round %d: Enter your lucky number: ", i);
            int luckyNumber = reader.nextInt();

            int remainder = luckyNumber % secretNumber;
            if (remainder == 0) {
                totalScore += 1;
                System.out.println("It's a draw!");
            } else if (remainder % 2 == 0) {
                totalScore += 3;
                System.out.println("You win!");
            } else {
                totalScore -= 3;
                System.out.println("You lose!");
            }
        }
        System.out.println("Total score: " + totalScore);

        if (totalScore > 0) {
            System.out.println("Congratulations! You won the game!");
        } else {
            System.out.println("Sorry, you lost the game.Probably,you can try next time");
        }

        reader.close();
    }

}

