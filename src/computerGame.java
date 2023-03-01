import java.util.Random;
import java.util.Scanner;
public class computerGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of rounds to play: ");
        int rounds = Integer.parseInt(sc.nextLine().trim());
        int totalScore = 0;



        System.out.println("\nTHE GAME BEGINS !!!\n-------------------");

        for(int i = 0; i < rounds; i++)
        {
            // generate a random number for the secret number
            Random rand = new Random();
            int secret = 0 + rand.nextInt(10);
            while(secret <= 0 || secret >= 10)
            {
                secret = 0 + rand.nextInt(10);
            }

            System.out.print("Please enter your lucky number: ");
            int lucky = Integer.parseInt(sc.nextLine().trim());
            int remainder = (lucky % secret);
            System.out.println(lucky + " % " + secret + " = " + remainder);

            if(remainder == 0)
            {
                System.out.println("Result for round " + (i + 1) + ": Draw\n");
                totalScore += 1;
            }
            else
            {
                if(isEven(remainder))
                {
                    System.out.println("Result for round " + (i + 1) + ": Win\n");
                    totalScore += 3;
                }
                else
                {
                    System.out.println("Result for round " + (i + 1) + ": Lose\n");
                    totalScore -= 3;
                }
            }
        }

        if(totalScore > 0)
            System.out.println("Congratulations, you won the whole game!\n");
        else
            System.out.println("Sorry, you lost the game...better luck next time!\n");
    }

    private static boolean isEven(int n)
    {
        if(n % 2 == 0)
            return true;
        else
            return false;
    }
}
