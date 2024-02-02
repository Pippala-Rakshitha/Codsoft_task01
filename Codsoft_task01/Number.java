
import java.util.Random;
import java.util.Scanner;
public class Number{
    public static void main(String args[])
    {
        Random r=new Random();
        int Number=r.nextInt(100)+1;
        Scanner s=new Scanner(System.in);
        int guess;
        System.out.println("NUMBER GUESSING GAME!\n");
        System.out.println("Guess a number between 1 to 100");
        while(true)
        {
            guess=s.nextInt();
            if(guess==Number){
                System.out.println("Congoo,You guessed the number");
                break;
            }
            else if(guess<Number){
                System.out.println("your guess is too low ");
            }
            else {
                System.out.println("your guess is too high");
            }
        }
        s.close();
    }
}