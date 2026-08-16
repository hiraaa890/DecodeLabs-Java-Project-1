import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DecodeLabs_Java_P1 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("_________NUMBER GAME________");
        System.out.println("");

        String contin = "yes";
        boolean win = false;
        int score = 0;
        int level = 0;

        while (contin.equalsIgnoreCase("yes")) {
            int num = r.nextInt(1, 101);
            win = false;
            score=0;
            level++;
            int count = 5;

            System.out.println("----------Level:" + level + "----------");
            System.out.println("Guess the number from 1 to 100");
            while (count > 0) {
                try {

                    int guess = sc.nextInt();
                    if (guess < num) {
                        System.out.println("Too Low");
                    } else if (guess == num) {
                        System.out.println("You guessed correct");
                        win = true;
                        score = count * 20;

                        break;
                    } else {
                        System.out.println("Too high");
                    }
                    count--;

                } catch (InputMismatchException e) {
                    System.out.println("You entered invalid input try again");
                    sc.nextLine();
                }

            }
            if (win) {
                System.out.println("Congratulations you win the game");
                System.out.println("Level: " + level + " score :" + score + "%");
                System.out.println("--------------------------");
            } else {
                System.out.println("Sorry game ended , you exceed attempt limit");
                System.out.println("Level : " + level + " score :" + score + "%");
                System.out.println("--------------------------");
            }
            System.out.println("");
            System.out.println("==> Do you want to continue ?");
            contin = sc.next();

        }

    }

}
